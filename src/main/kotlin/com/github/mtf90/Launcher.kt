package com.github.mtf90

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.IOException

class Launcher : Application() {

    @Throws(IOException::class)
    override fun start(primaryStage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("/com/github/mtf90/Main.fxml"))
        primaryStage.title = "EisenPOWA"
        primaryStage.scene = Scene(root, 800.0, 600.0)
        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Launcher::class.java, *args)
        }
    }
}
