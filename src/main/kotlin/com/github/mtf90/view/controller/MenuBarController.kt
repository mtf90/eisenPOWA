package com.github.mtf90.view.controller

import com.github.mtf90.view.SceneController
import com.github.mtf90.util.Scenes
import javafx.application.Platform

class MenuBarController {

    fun close() {
        SceneController.setScene(Scenes.Menu)
    }

    fun exit() {
        Platform.exit();
    }
}