package com.github.mtf90.view

import com.github.mtf90.model.Task
import javafx.beans.NamedArg
import javafx.geometry.Insets
import javafx.scene.layout.VBox

class CellView(@NamedArg("tasks") val tasks: List<Task>) : VBox() {

    init {
        super.setPadding(Insets(20.0, 20.0, 20.0, 20.0))
        super.setStyle("-fx-background-color: red;")
        super.getChildren().addAll(tasks.map { e -> TaskView(e) })
    }
}
