package com.github.mtf90.view

import com.github.mtf90.model.Task
import javafx.scene.input.DataFormat

object DataFormats {

    val task = DataFormat(Task::class.qualifiedName)
}