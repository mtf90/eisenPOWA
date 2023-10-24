package com.github.mtf90.view

import javafx.fxml.FXMLLoader
import java.lang.IllegalArgumentException
import java.net.URL

object ViewController {

    fun <T : Any> initialize(view: T) {
        val fxmlLoader = FXMLLoader(view.javaClass.toFXMLResource())

        fxmlLoader.setRoot(view)
        fxmlLoader.setController(view)

        fxmlLoader.load<Any>()
    }

    private fun <T> Class<T>.toFXMLResource(): URL {
        val sb = StringBuilder()
        sb.append('/')
        sb.append(packageName.replace('.', '/'))
        sb.append('/')
        sb.append(simpleName)
        sb.append(".fxml")

        return this.getResource(sb.toString()) ?: throw IllegalArgumentException("Cannot find resource $sb")
    }
}
