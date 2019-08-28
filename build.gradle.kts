buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.0-alpha08")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
        classpath("com.github.jengelman.gradle.plugins:shadow:5.0.0")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
        maven {
            setUrl("https://dl.bintray.com/sphrak/either/")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}