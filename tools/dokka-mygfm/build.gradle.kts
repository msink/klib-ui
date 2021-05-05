import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
}

dependencies {
    compileOnly("org.jetbrains.dokka:dokka-core:1.5.0")
    implementation("org.jetbrains.dokka:dokka-base:1.5.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.1")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
