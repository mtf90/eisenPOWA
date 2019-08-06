package com.github.mtf90.model

class Matrix {

    private val cells: Array<Array<MutableList<Task>>> = Array(2) { Array(2) { mutableListOf<Task>() } }

    enum class Urgency {
        URGENT, NOT_URGENT
    }

    enum class Importance {
        IMPORTANT, NOT_IMPORTANT
    }

    fun getCellContent(u: Urgency, i: Importance): List<Task> {
        return cells[u.ordinal][i.ordinal]
    }

    fun addToCell(u: Urgency, i: Importance, task: Task) {
        cells[u.ordinal][i.ordinal].add(task)
    }

    fun addRemoveFromCell(u: Urgency, i: Importance, task: Task) {
        cells[u.ordinal][i.ordinal].remove(task)
    }
}
