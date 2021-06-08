buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.4.10.2")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }

    version = "2.1.1"
    group = "io.github.sphrak"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}