package com.github.mtf90.model

class DummyProject : Project(getDummyMatrices(), getDummyCurrentMatrix(), getDummyOpenTasks()) {

    companion object {
        fun getDummyMatrices(): MutableList<Matrix> {
            return mutableListOf()
        }

        fun getDummyCurrentMatrix(): Matrix {
            val result = Matrix()
            result.addToCell(Matrix.Urgency.URGENT, Matrix.Importance.IMPORTANT, Task("T1", "Task 1"))
            result.addToCell(Matrix.Urgency.URGENT, Matrix.Importance.IMPORTANT, Task("T1", "Task 1"))
            result.addToCell(Matrix.Urgency.URGENT, Matrix.Importance.NOT_IMPORTANT, Task("T2", "Task 2"))
            result.addToCell(Matrix.Urgency.URGENT, Matrix.Importance.NOT_IMPORTANT, Task("T2", "Task 2"))
            result.addToCell(Matrix.Urgency.NOT_URGENT, Matrix.Importance.IMPORTANT, Task("T3", "Task 3"))
            result.addToCell(Matrix.Urgency.NOT_URGENT, Matrix.Importance.IMPORTANT, Task("T3", "Task 3"))
            result.addToCell(Matrix.Urgency.NOT_URGENT, Matrix.Importance.NOT_IMPORTANT, Task("T4", "Task 4"))
            result.addToCell(Matrix.Urgency.NOT_URGENT, Matrix.Importance.NOT_IMPORTANT, Task("T4", "Task 4"))

            return result
        }

        fun getDummyOpenTasks(): MutableList<Task> {
            return mutableListOf(Task("OT1", "Open Task 1"), Task("OT2", "Open Task 2"))
        }
    }

}
