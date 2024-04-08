package com.foo.pets

import com.foo.pets.tasks.ListDogs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

class PetsPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create("pets", PetsExtension::class.java)
        project.tasks.register<ListDogs>("listDogs")
    }

}
