pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven {
            setUrl("https://jitpack.io")
        }
    }
}

include(":either")