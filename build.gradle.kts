plugins {
    kotlin("jvm") version "1.3.30"
}

buildscript {
    dependencies {
        //classpath("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin:latest.integration")
        classpath("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin:dc85f651b7")
    }

    repositories {
        mavenCentral()
        google()
        maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://jitpack.io") }
    }
}

apply(plugin = "libgdx")

allprojects {

    group = "com.github.dwursteisen"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        google()
        jcenter()
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
    }

}

project(":desktop") {

}

project(":core") {

}