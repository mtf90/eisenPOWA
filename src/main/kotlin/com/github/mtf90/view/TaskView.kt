package com.github.mtf90.view

import com.github.mtf90.model.Task
import com.github.mtf90.util.ViewFactory
import javafx.beans.NamedArg
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.layout.AnchorPane

class TaskView(@NamedArg("task") val task: Task) : AnchorPane() {

    @FXML
    lateinit var heading: Label

    @FXML
    lateinit var description: Label

    init {
        ViewFactory.initialize(this)
    }

    fun initialize() {
        heading.text = task.label
        description.text = task.description
    }
}