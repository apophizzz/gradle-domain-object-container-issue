plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("pets") {
            id = "pets"
            implementationClass = "com.foo.pets.PetsPlugin"
        }
    }
}
