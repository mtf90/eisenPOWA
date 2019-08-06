package com.github.mtf90.view

import com.github.mtf90.model.Matrix
import com.github.mtf90.model.Task
import com.github.mtf90.util.ViewFactory
import javafx.beans.NamedArg
import javafx.fxml.FXML
import javafx.scene.layout.GridPane

class MatrixView(@NamedArg("matrix") @FXML val matrix: Matrix) : GridPane() {

    val urgentImportantTasks: List<Task>
    val urgentNonImportantTasks: List<Task>
    val nonUrgentImportantTasks: List<Task>
    val nonUrgentNonImportantTasks: List<Task>

    init {
        urgentImportantTasks = matrix.getCellContent(Matrix.Urgency.URGENT, Matrix.Importance.IMPORTANT)
        urgentNonImportantTasks = matrix.getCellContent(Matrix.Urgency.URGENT, Matrix.Importance.NOT_IMPORTANT)
        nonUrgentImportantTasks = matrix.getCellContent(Matrix.Urgency.NOT_URGENT, Matrix.Importance.IMPORTANT)
        nonUrgentNonImportantTasks = matrix.getCellContent(Matrix.Urgency.NOT_URGENT, Matrix.Importance.NOT_IMPORTANT)
        ViewFactory.initialize(this)
    }
}
