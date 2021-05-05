// SPDX-License-Identifier: MIT OR Apache-2.0

object Publish {
    const val group = "com.github.msink"
    const val user = "msink"
    object pom {
        const val url = "https://github.com/msink/kotlin-libui"
        const val connection = "scm:git:https://github.com/msink/kotlin-libui.git"
        const val devConnection = "scm:git:git@github.com:msink/kotlin-libui.git"
    }
}

object Kotlin {
    const val version = "1.5.0"
}

object Libui {
    const val version = "alpha4.1-openfolder"
    const val repo = "https://github.com/msink/libui"
}

object Dokka {
    const val version = "1.5.0"
}

object Download {
    const val version = "4.1.1"
}
