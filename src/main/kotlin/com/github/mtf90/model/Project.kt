package com.github.mtf90.model

open class Project {

    private val matrix: Matrix
    private val openTasks: MutableList<Task>

    constructor() {
        matrix = Matrix()
        openTasks = mutableListOf()
    }

    protected constructor(matrix: Matrix, openTasks: MutableList<Task>) {
        this.matrix = matrix
        this.openTasks = openTasks
    }

    fun getMatrix(): Matrix {
        return matrix
    }

    fun getOpenTasks(): List<Task> {
        return openTasks
    }

    fun addTask(t: Task) {
        openTasks.add(t)
    }
}
