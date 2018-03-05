package com.github.mtf90.model

class Project {

    private val matrices: MutableList<Matrix>
    private val currentMatrix: Matrix
    private val openTasks: MutableList<Task>

    init {
        currentMatrix = Matrix()
        matrices = mutableListOf(currentMatrix)
        openTasks = mutableListOf()
    }

    fun getMatrices(): List<Matrix> {
        return matrices
    }

    fun addMatric(m: Matrix) {
        matrices.add(m)
    }

    fun getCurrentMatrix(): Matrix {
        return currentMatrix
    }

    fun getOpenTasks(): List<Task> {
        return openTasks
    }

    fun addTask(t: Task) {
        openTasks.add(t)
    }

    companion object {
        var INSTANCE: Project = Project()
    }
}