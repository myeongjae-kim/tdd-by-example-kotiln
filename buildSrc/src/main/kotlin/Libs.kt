object Libs {
    object Version {
        const val kotest = "4.6.0"
    }

    object Test {
        const val kotest = "io.kotest:kotest-runner-junit5:${Version.kotest}"
        const val kotestAssertionsCore = "io.kotest:kotest-assertions-core:${Version.kotest}"
        const val kotestPropertyTesting = "io.kotest:kotest-property:${Version.kotest}"
    }
}
