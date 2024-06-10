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
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
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
include(":either-extensions")