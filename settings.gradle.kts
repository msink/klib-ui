// SPDX-License-Identifier: MIT OR Apache-2.0
@file:Suppress("SpellCheckingInspection")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    }
}

plugins {
  id("com.gradle.enterprise").version("3.1.1")
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

include(":libui")

include(":samples:controlgallery")
include(":samples:datetime")
include(":samples:drawtext")
include(":samples:form")
include(":samples:hello")
include(":samples:hello-ktx")
include(":samples:histogram")
include(":samples:logo")
include(":samples:table")
include(":samples:timer")
