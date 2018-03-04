package com.github.mtf90

import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class Main : Initializable {

    @FXML
    var label: Label? = null

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        label?.text = "Hello World!"
    }

    fun shutdown() {
        Platform.exit()
    }
}