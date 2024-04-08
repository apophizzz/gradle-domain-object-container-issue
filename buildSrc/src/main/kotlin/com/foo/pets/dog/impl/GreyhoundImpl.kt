package com.foo.pets.dog.impl

import com.foo.pets.dog.api.Greyhound
import javax.inject.Inject

open class GreyhoundImpl @Inject constructor(objectName: String) : Greyhound(objectName) {
}
