package com.github.mtf90

/**
 * Utility class for UberJAR. See [StackOverflow]
 * [https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing].
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        App.main(args)
    }
}
