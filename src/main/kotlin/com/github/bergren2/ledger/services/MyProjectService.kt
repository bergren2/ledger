package com.github.bergren2.ledger.services

import com.github.bergren2.ledger.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
