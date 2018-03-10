package com.github.mtf90

import com.github.mtf90.model.DummyProject
import com.github.mtf90.model.Matrix
import com.github.mtf90.model.Project
import com.github.mtf90.util.SceneFactory
import com.github.mtf90.util.Scenes
import javafx.fxml.FXML

class Editor {

    val project: Project

    @FXML
    val currentMatrix: Matrix

    init {
        project = DummyProject()
        currentMatrix = project.getCurrentMatrix()
    }

    fun close() {
        SceneFactory.setScene(Scenes.Menu)
    }
}