buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("org.jetbrains.dokka:android-documentation-plugin:1.9.10")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
    }
}

allprojects {
    repositories {
        mavenCentral()
    }

    version = "2.2.2"
    group = "io.github.sphrak"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}