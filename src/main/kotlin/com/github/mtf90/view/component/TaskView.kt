package com.github.mtf90.view.component

import com.github.mtf90.model.Task
import com.github.mtf90.view.ViewController
import javafx.beans.NamedArg
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.VBox

class TaskView(@NamedArg("task") private val task: Task) : VBox() {

    @FXML
    lateinit var heading: Label

    @FXML
    lateinit var description: Label

    init {
        ViewController.initialize(this)
    }

    fun initialize() {
        heading.text = task.label
        description.text = task.description
    }
}
