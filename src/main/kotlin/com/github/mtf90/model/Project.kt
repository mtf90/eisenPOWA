package com.github.mtf90.model

open class Project {

    private val matrices: MutableList<Matrix>
    private val currentMatrix: Matrix
    private val openTasks: MutableList<Task>

    constructor() {
        currentMatrix = Matrix()
        matrices = mutableListOf(currentMatrix)
        openTasks = mutableListOf()
    }

    protected constructor(matrices: MutableList<Matrix>, currentMatrix: Matrix, openTasks: MutableList<Task>) {
        this.currentMatrix = currentMatrix
        this.matrices = matrices
        this.openTasks = openTasks
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