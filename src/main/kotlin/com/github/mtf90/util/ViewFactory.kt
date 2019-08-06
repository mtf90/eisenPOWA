package com.github.mtf90.util

import javafx.fxml.FXMLLoader
import java.net.URL


object ViewFactory {

    fun <T : Any> initialize(view: T) {
        val fxmlLoader = FXMLLoader(view.javaClass.toFXMLResource())

        fxmlLoader.setRoot(view)
        fxmlLoader.setController(view)

        fxmlLoader.load<Any>()
    }

    fun <T> Class<T>.toFXMLResource(): URL {
        val sb = StringBuilder()
        sb.append('/')
        sb.append(packageName.replace('.', '/'))
        sb.append('/')
        sb.append(simpleName)
        sb.append(".fxml")

        return this.getResource(sb.toString())
    }
}
