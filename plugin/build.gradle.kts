plugins {
    `kotlin-dsl`
    // kotlin("jvm") version "1.6.21"
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:5.0.0-SNAPSHOT")
    // implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.10")
}