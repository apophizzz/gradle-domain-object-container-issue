package com.foo.pets.dog.impl

import com.foo.pets.dog.api.Beagle
import javax.inject.Inject

open class BeagleImpl @Inject constructor(objectName: String) : Beagle(objectName) {
}
