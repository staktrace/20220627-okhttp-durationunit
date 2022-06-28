buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        classpath(files("../plugin/build/libs/plugin.jar"))
        classpath("com.squareup.okhttp3:okhttp:5.0.0-SNAPSHOT")
    }
}

plugins {
    // kotlin("jvm") version "1.6.21"
}

apply<MyPlugin>()
