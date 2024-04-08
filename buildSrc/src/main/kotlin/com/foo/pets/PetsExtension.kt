package com.foo.pets

import com.foo.pets.dog.api.Beagle
import com.foo.pets.dog.api.Dog
import com.foo.pets.dog.api.Greyhound
import com.foo.pets.dog.impl.BeagleImpl
import com.foo.pets.dog.impl.GreyhoundImpl
import org.gradle.api.Action
import org.gradle.api.PolymorphicDomainObjectContainer
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

abstract class PetsExtension @Inject constructor(objectFactory: ObjectFactory) {
    private val dogs = objectFactory.polymorphicDomainObjectContainer(Dog::class.java).apply {
        registerBinding(Greyhound::class.java, GreyhoundImpl::class.java)
        registerBinding(Beagle::class.java, BeagleImpl::class.java)
    }

    fun dogs(action: Action<PolymorphicDomainObjectContainer<Dog>>) {
        action.execute(dogs)
    }

    fun getDogs() = dogs
}
