package com.github.r15h.vimiwhere.services

import com.intellij.openapi.project.Project
import com.github.r15h.vimiwhere.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
