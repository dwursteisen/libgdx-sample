import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.30"
    `java-library`
}

buildscript {
    dependencies {
       classpath("com.github.dwursteisen.libgdx-addons:libgdx-gradle-plugin:latest.integration")
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


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


val kotlinVersion = "1.3.30"
val gdxVersion = "1.9.9"

project(":desktop") {
    apply(plugin = "kotlin")
    apply(plugin = "java-library")

    dependencies {
        implementation(project(":core"))
        implementation("com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion")
        implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
        implementation(kotlin("stdlib-jdk8"))

    }
}

project(":core") {
    apply(plugin = "kotlin")
    apply(plugin = "java-library")

    dependencies {
        api("com.badlogicgames.gdx:gdx:$gdxVersion")
        implementation(kotlin("stdlib-jdk8"))
    }
}