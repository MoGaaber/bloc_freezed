package com.github.mogaaber.blocfreezed.services

import com.github.mogaaber.blocfreezed.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
