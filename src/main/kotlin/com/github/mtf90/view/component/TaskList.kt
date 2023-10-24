package com.github.mtf90.view.component

import com.github.mtf90.model.Task
import com.github.mtf90.view.ViewController
import javafx.beans.NamedArg
import javafx.collections.ListChangeListener
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.layout.VBox

class TaskList(@NamedArg("tasks") @FXML private val tasks: ObservableList<Task>) : VBox() {

    init {
        tasks.addListener(ListChangeListener { change ->
            while (change.next()) {
                if (change.wasAdded()) {
                    children.addAll(change.addedSubList.map { t -> TaskView(t) })
                }
            }
        })
        children.addAll(tasks.map { t -> TaskView(t) })
        ViewController.initialize(this)
    }
}
