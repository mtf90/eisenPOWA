package com.github.mtf90.util

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

object SceneFactory {

    private lateinit var stage: Stage

    fun initStage(s: Stage) {
        stage = s
    }

    fun setScene(s: Scenes) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource(s.scenePath))
        stage.scene = Scene(root)
    }

}
