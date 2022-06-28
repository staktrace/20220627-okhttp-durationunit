buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(files("../plugin/build/libs/plugin.jar"))
        classpath("com.squareup.okhttp3:okhttp:5.0.0-alpha.10") // this isn't needed if you publish plugin.jar and use the pom file to resolve dependencies, but we're relying on the raw jar so we need this
    }
}

apply<MyPlugin>()
