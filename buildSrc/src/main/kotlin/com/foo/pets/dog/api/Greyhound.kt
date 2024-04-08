package com.foo.pets.dog.api

import javax.inject.Inject

abstract class Greyhound @Inject constructor(objectName: String) : Dog(objectName) {
}
