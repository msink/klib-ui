// SPDX-License-Identifier: MIT OR Apache-2.0
@file:Suppress("SpellCheckingInspection")

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val samplesResourcesDir = "$projectDir/resources"

subprojects {
    apply(plugin = "kotlin-multiplatform")

    configure<KotlinMultiplatformExtension> {
        if (os.isWindows) {
            mingwX64("windows64")
            if (!isRunningInIde) {
                mingwX86("windows")
            }
        }
        if (os.isLinux) {
            linuxX64("linux")
        }
        if (os.isMacOsX) {
            macosX64("macosx")
        }

        fun org.jetbrains.kotlin.gradle.plugin.mpp.Executable.windowsResources(rcFileName: String) {
            val taskName = linkTaskName.replaceFirst("link", "windres")
            val inFile = File(rcFileName)
            val outFile = buildDir.resolve("processedResources/$taskName.res")

            val windresTask = tasks.create<Exec>(taskName) {
                val konanUserDir = System.getenv("KONAN_DATA_DIR") ?: "${System.getProperty("user.home")}/.konan"
                val konanLlvmDir = when (target.konanTarget.architecture) {
                    org.jetbrains.kotlin.konan.target.Architecture.X86 ->
                        "$konanUserDir/dependencies/msys2-mingw-w64-i686-clang-llvm-lld-compiler_rt-8.0.1/bin"
                    org.jetbrains.kotlin.konan.target.Architecture.X64 ->
                        "$konanUserDir/dependencies/msys2-mingw-w64-x86_64-clang-llvm-lld-compiler_rt-8.0.1/bin"
                    else -> throw Error("Unsupported architecture")
                }

                inputs.file(inFile)
                outputs.file(outFile)
                commandLine("$konanLlvmDir/windres", inFile, "-D_${buildType.name}", "-O", "coff", "-o", outFile)
                environment("PATH", "$konanLlvmDir;${System.getenv("PATH")}")

                dependsOn(compilation.compileKotlinTask)
            }

            linkTask.dependsOn(windresTask)
            linkerOpts(outFile.toString())
        }

        targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget> {
            sourceSets["${targetName}Main"].apply {
                kotlin.srcDir("src/nativeMain/kotlin")
                dependencies {
                    implementation(project(":libui"))
                }
            }
            binaries {
                executable(listOf(RELEASE)) {
                    if (konanTarget.family == org.jetbrains.kotlin.konan.target.Family.MINGW) {
                        windowsResources("${rootProject.rootDir}/samples/resources/samples.rc")
                    }
                }
            }
        }
    }
}
