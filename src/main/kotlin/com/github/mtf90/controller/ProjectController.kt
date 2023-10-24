package com.github.mtf90.controller

import com.github.mtf90.model.DummyProject
import com.github.mtf90.model.Project
import com.github.mtf90.model.Task

object ProjectController {

    private var currentProject: Project = DummyProject()

    fun setCurrentProject(p : Project) {
        this.currentProject = p;
    }

    fun getCurrentProject() : Project {
        return this.currentProject
    }

    fun addNewOpenTaskToProject(project: Project, task :Task) {
        project.addTask(task)
    }

}