plugins {
    kotlin("jvm") version "1.3.30"
}

buildscript {
    dependencies {
       classpath("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin:latest.integration")
    }

    repositories {
        mavenCentral()
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
    }
}

apply(plugin = "libgdx")

allprojects {

    group = "com.github.dwursteisen"
    version = "1.0-SNAPSHOT"


    repositories {
        mavenCentral()
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
    }

}

project(":desktop") {

}

project(":core") {

}