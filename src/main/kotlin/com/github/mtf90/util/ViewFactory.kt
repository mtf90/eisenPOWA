package com.github.mtf90.util

import javafx.fxml.FXMLLoader
import java.io.IOException
import java.net.URL


object ViewFactory {

    fun <T : Any> initialize(view: T) {
        val fxmlLoader = FXMLLoader(view.javaClass.toFXMLResource())

        fxmlLoader.setRoot(view)
        fxmlLoader.setController(view)

        try {
            fxmlLoader.load<Any>()
        } catch (exception: IOException) {
            throw RuntimeException(exception)
        }
    }

    fun <T> Class<T>.toFXMLResource(): URL {
        val sb = StringBuilder()
        sb.append('/')
        sb.append(this.packageName.replace('.', '/'))
        sb.append('/')
        sb.append(this.simpleName)
        sb.append(".fxml")

        return this.getResource(sb.toString())
    }
}