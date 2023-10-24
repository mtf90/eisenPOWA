package com.github.mtf90.view.controller

import com.github.mtf90.view.SceneController
import com.github.mtf90.util.Scenes
import javafx.application.Platform

class MenuSceneController {

    fun openNew() {
        // TODO: replace with actual fresh project, once adding new items is implemented
        // ProjectController.setCurrentProject(DummyProject())
        SceneController.setScene(Scenes.Editor)
    }

    fun exit() {
        Platform.exit()
    }
}
