// SPDX-License-Identifier: MIT OR Apache-2.0

@file:Suppress("SpellCheckingInspection")

import de.undercouch.gradle.tasks.download.Download
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import org.jetbrains.kotlin.konan.target.Family
import org.jetbrains.kotlin.konan.target.KonanTarget.*

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
    id("de.undercouch.download")
    id("maven-publish")
}

val VERSION_NAME: String by project
val VERSION_SUFFIX: String by project
val BINTRAY_REPO: String by project

group = Publish.group
version = "$VERSION_NAME$VERSION_SUFFIX"

kotlin {
    val publishModeEnabled = rootProject.hasProperty("publishMode")
    println("publishModeEnabled: $publishModeEnabled")

    if (publishModeEnabled || os.isWindows) {
        mingwX64("windows64")
        if (!isRunningInIde) {
            mingwX86("windows")
        }
    }
    if (publishModeEnabled || os.isLinux) {
        linuxX64("linux")
    }
    if (publishModeEnabled || os.isMacOsX) {
        macosX64("macosx")
    }

    targets.withType<KotlinNativeTarget> {
        sourceSets["${targetName}Main"].apply {
            kotlin.srcDir("src/nativeMain/kotlin")
        }
        compilations["main"].apply {
            cinterops.create("libui") {
                includeDirs("$buildDir/libui/${konanTarget.name}")
            }
            kotlinOptions.freeCompilerArgs = listOf(
                "-include-binary", "$buildDir/libui/${konanTarget.name}/libui.a"
            )
        }
    }
}

tasks.withType<CInteropProcess> {
    val archiveFile = File("$buildDir/libui/${konanTarget.name}",
        "libui.${if (konanTarget.family == Family.MINGW) "zip" else "tgz"}")

    val downloadArchive = tasks.register<Download>(name.replaceFirst("cinterop", "download")) {
        val release = "${Libui.repo}/releases/download/${Libui.version}/libui-${Libui.version}"
        when (konanTarget) {
            MINGW_X86 -> src("$release-windows-386-mingw-static.zip")
            MINGW_X64 -> src("$release-windows-amd64-mingw-static.zip")
            LINUX_X64 -> src("$release-linux-amd64-static.tgz")
            MACOS_X64 -> src("$release-darwin-amd64-static.tgz")
        }
        dest(archiveFile)
        overwrite(false)
    }

    val unpackArchive = tasks.register<Copy>(name.replaceFirst("cinterop", "unpack")) {
        if (konanTarget.family == Family.MINGW) {
            from(zipTree(archiveFile))
        } else {
            from(tarTree(resources.gzip(archiveFile)))
        }
        into("$buildDir/libui/${konanTarget.name}")
        dependsOn(downloadArchive)
    }

    dependsOn(unpackArchive)
}

tasks.register<DokkaTask>("dokkaMyGfm") {
    dependencies {
        plugins("com.github.msink.tools:dokka-mygfm")
    }
    dokkaSourceSets {
        configureEach {
            if (name == "windowsMain") {
                suppress.set(true)
            } else {
                outputDirectory.set(rootProject.rootDir.resolve("docs"))
                noStdlibLink.set(true)
                suppressObviousFunctions.set(true)
                suppressInheritedMembers.set(false)
            }
        }
    }
    pluginsMapConfiguration.set(mapOf(
        "org.jetbrains.dokka.base.DokkaBase" to """{ "separateInheritedMembers": true }"""
    ))
}

publishing {
    publications.withType<MavenPublication> {
        pom {
            name.set("libui")
            description.set("Kotlin/Native interop to libui: a portable GUI library")
            url.set(Publish.pom.url)
            licenses {
                license {
                    name.set("MIT License")
                    url.set(Publish.pom.url)
                    distribution.set("repo")
                }
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }
            developers {
                developer {
                    id.set("msink")
                    name.set("Mike Sinkovsky")
                    email.set("msink@permonline.ru")
                }
            }
            scm {
                url.set(Publish.pom.url)
                connection.set(Publish.pom.connection)
                developerConnection.set(Publish.pom.devConnection)
            }
        }
    }

    repositories {
        maven("https://api.bintray.com/maven/${Publish.user}/$BINTRAY_REPO/libui/;publish=0;override=1") {
            credentials {
                username = Publish.user
                password = System.getenv("BINTRAY_API_KEY")
            }
        }
    }
}

tasks.withType<AbstractPublishToMaven> {
    onlyIf { !name.startsWith("publishWindows") || os.isWindows }
    onlyIf { !name.startsWith("publishMacosx") || os.isMacOsX }
    onlyIf { !name.startsWith("publishLinux") || os.isLinux }
}
