package com.github.mtf90

import com.github.mtf90.util.SceneFactory
import com.github.mtf90.util.Scenes
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.IOException

class Launcher : Application() {

    @Throws(IOException::class)
    override fun start(primaryStage: Stage) {
        SceneFactory.initStage(primaryStage)
        SceneFactory.setScene(Scenes.Menu)

        primaryStage.title = "EisenPOWA"
        primaryStage.width = 800.0
        primaryStage.height = 600.0
        primaryStage.centerOnScreen()
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Launcher::class.java, *args)
        }
    }
}
