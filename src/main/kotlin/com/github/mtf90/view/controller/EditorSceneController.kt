package com.github.mtf90.view.controller

import com.github.mtf90.controller.ProjectController
import com.github.mtf90.model.Matrix
import com.github.mtf90.model.Project
import com.github.mtf90.model.Task
import com.github.mtf90.view.component.TaskList
import javafx.beans.NamedArg
import javafx.collections.FXCollections
import javafx.collections.ListChangeListener
import javafx.fxml.FXML
import javafx.scene.control.TextArea
import javafx.scene.control.TextField

class EditorSceneController {

    @FXML
    lateinit var newTaskHeading: TextField

    @FXML
    lateinit var newTaskDescription: TextArea

    val project: Project = ProjectController.getCurrentProject()
    val matrix: Matrix = project.getMatrix()
    val openTasks = FXCollections.observableList(project.getOpenTasks())

    val urgentImportantTasks = FXCollections.observableList(matrix.getCellContent(Matrix.Urgency.URGENT, Matrix.Importance.IMPORTANT))
    val urgentNonImportantTasks = FXCollections.observableList(matrix.getCellContent(Matrix.Urgency.URGENT, Matrix.Importance.NOT_IMPORTANT))
    val nonUrgentImportantTasks = FXCollections.observableList(matrix.getCellContent(Matrix.Urgency.NOT_URGENT, Matrix.Importance.IMPORTANT))
    val nonUrgentNonImportantTasks = FXCollections.observableList(matrix.getCellContent(Matrix.Urgency.NOT_URGENT, Matrix.Importance.NOT_IMPORTANT))


    fun createNewTask() {
        val task = Task(newTaskHeading.text, newTaskDescription.text)
        openTasks.add(task) // propagate changes and write through model
        newTaskHeading.text = ""
        newTaskDescription.text = ""
    }

}
