package com.foo.pets.tasks

import com.foo.pets.PetsExtension
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import javax.inject.Inject

abstract class ListDogs @Inject constructor() : DefaultTask() {

    @TaskAction
    fun run() {
        val petsExtension = project.extensions.getByType(PetsExtension::class.java)
        val dogs = petsExtension.getDogs()
        dogs.forEach {
            println("Hi, my name is ${it.name}")
        }
    }
}
