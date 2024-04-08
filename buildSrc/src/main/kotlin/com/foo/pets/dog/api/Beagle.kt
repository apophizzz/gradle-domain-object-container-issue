package com.foo.pets.dog.api

import javax.inject.Inject

abstract class Beagle @Inject constructor(objectName: String) : Dog(objectName) {
}
