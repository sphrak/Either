plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.0.0"
    id("module.publication")
}

kotlin {
    applyDefaultHierarchyTemplate()
    jvm {
        withJava()
    }

    linuxX64()
    linuxArm64()

    mingwX64()

    macosX64()
    macosArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":either"))
                implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test:2.0.0")
            }
        }
    }
}