package com.github.mtf90.view.component

import com.github.mtf90.model.Task
import com.github.mtf90.view.DataFormats
import com.github.mtf90.view.ViewController
import javafx.beans.NamedArg
import javafx.collections.ListChangeListener
import javafx.collections.ObservableList
import javafx.css.PseudoClass
import javafx.fxml.FXML
import javafx.scene.input.TransferMode
import javafx.scene.layout.VBox


class TaskList(@NamedArg("tasks") @FXML private val tasks: ObservableList<Task>) : VBox() {

    init {
        children.addAll(tasks.map { t -> TaskView(tasks, t) })

        tasks.addListener(ListChangeListener { change ->
            while (change.next()) {
                if (change.wasAdded()) {
                    children.addAll(change.addedSubList.map { t -> TaskView(tasks, t) })
                }
                if (change.wasRemoved()) {
                    children.remove(change.from, change.to + 1)
                }
            }
        })

        setOnDragOver { event ->
            if (!this.children.contains(event.gestureSource) && event.dragboard.hasContent(DataFormats.task)) {
                event.acceptTransferModes(TransferMode.MOVE);
            }
            event.consume();
        }

        setOnDragEntered { event ->
            if (!this.children.contains(event.gestureSource) && event.dragboard.hasContent(DataFormats.task)) {
                pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), true)
            }
            event.consume()
        }

        setOnDragExited { event ->
            pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), false)
            event.consume()
        }

        setOnDragDropped { event ->
            val db = event.dragboard
            var success = false
            if (db.hasContent(DataFormats.task)) {
                tasks.add(db.getContent(DataFormats.task) as Task)
                success = true
            }
            event.isDropCompleted = success
            event.consume()
        }

        ViewController.initialize(this)
    }
}
