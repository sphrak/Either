plugins {
    id("org.jetbrains.kotlin.multiplatform").version("2.0.0") apply false
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.15.0-Beta.2"
    id("root.publication")
}

apiValidation {
    @OptIn(kotlinx.validation.ExperimentalBCVApi::class)
    klib {
        enabled = true
    }
}