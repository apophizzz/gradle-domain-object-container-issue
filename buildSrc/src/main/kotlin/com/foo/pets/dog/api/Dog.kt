package com.foo.pets.dog.api

import org.gradle.api.Named
import javax.inject.Inject

abstract class Dog @Inject constructor(private val objectName: String) : Named {

    override fun getName(): String {
        return "$objectName (${this.javaClass.superclass.simpleName})"
        //return objectName
    }
}
