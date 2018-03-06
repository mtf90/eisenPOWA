package com.github.mtf90

import com.github.mtf90.util.SceneFactory
import com.github.mtf90.util.Scenes
import javafx.fxml.Initializable
import java.net.URL
import java.util.*

class Editor : Initializable {

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        // Do something
    }

    fun close() {
        SceneFactory.setScene(Scenes.Menu)
    }
}