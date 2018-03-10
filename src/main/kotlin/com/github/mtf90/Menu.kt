package com.github.mtf90

import com.github.mtf90.model.DummyProject
import com.github.mtf90.model.Project
import com.github.mtf90.util.SceneFactory
import com.github.mtf90.util.Scenes
import javafx.application.Platform
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class Menu : Initializable {

    @FXML
    lateinit var label: Label

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        label.text = "Hello World!"
    }

    fun openNew() {
        Project.INSTANCE = DummyProject()
        SceneFactory.setScene(Scenes.Editor)
    }

    fun shutdown() {
        Platform.exit()
    }
}