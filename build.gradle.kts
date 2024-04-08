import com.foo.pets.dog.api.Beagle
import com.foo.pets.dog.api.Greyhound

plugins {
    kotlin("jvm") version "1.9.23"
    id("pets")
}

group = "com.foo.pets"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(19)
}

pets {
    dogs {
        create<Beagle>("Berry")
        create<Greyhound>("Gerry")
        create<Beagle>("Berry")
    }
}
