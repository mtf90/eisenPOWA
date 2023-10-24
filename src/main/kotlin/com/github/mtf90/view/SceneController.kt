package com.github.mtf90.view

import com.github.mtf90.util.Scenes
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

object SceneController {

    private lateinit var stage: Stage

    fun init(s: Stage) {
        stage = s
    }

    fun setScene(s: Scenes) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource(s.scenePath))
        stage.scene = Scene(root)
    }
}
