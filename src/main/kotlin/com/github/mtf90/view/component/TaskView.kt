package com.github.mtf90.view.component

import com.github.mtf90.model.Task
import com.github.mtf90.view.DataFormats
import com.github.mtf90.view.ViewController
import javafx.collections.ObservableList
import javafx.css.PseudoClass
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.input.ClipboardContent
import javafx.scene.input.TransferMode
import javafx.scene.layout.VBox

class TaskView(private val tasks: ObservableList<Task>, private val task: Task) : VBox() {

    @FXML
    lateinit var heading: Label

    @FXML
    lateinit var description: Label

    init {
        setOnDragDetected { event ->
            val db = startDragAndDrop(TransferMode.MOVE)
            val content = ClipboardContent()
            content[DataFormats.task] = task
            db.setContent(content)
            pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), true)
            event.consume()
        }

        setOnDragDone { event ->
            if (event.acceptedTransferMode != null) {
                tasks.remove(task)
            }
            pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), false)
            event.consume();
        }

        ViewController.initialize(this)
    }

    fun initialize() {
        heading.text = task.label
        description.text = task.description
    }
}
