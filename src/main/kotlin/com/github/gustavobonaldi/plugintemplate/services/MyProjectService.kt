package com.github.gustavobonaldi.plugintemplate.services

import com.github.gustavobonaldi.plugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
