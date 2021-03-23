import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.jfrog.bintray.gradle.BintrayExtension

/*
 * Copyright (c) 2019 Niclas Kron.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "5.2.0"
    `maven-publish`
    id("com.jfrog.bintray")
    id("org.jetbrains.dokka")
}

val artifactId = "either"
val build: DefaultTask by tasks
val shadowJar = tasks["shadowJar"] as ShadowJar

build.dependsOn(shadowJar)

configurations {
    ktlint
}

tasks.withType<Test> {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

val ktlint: Configuration = configurations.create("ktlint")
val outputDir = "${project.buildDir}/reports/ktlint/"
val inputFiles = project.fileTree(mapOf("dir" to "src", "include" to "**/*.kt"))

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.31")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
    ktlint("com.pinterest:ktlint:0.39.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.1")
    testImplementation("org.assertj:assertj-core:3.13.2")
}

project.afterEvaluate {

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(project.sourceSets["main"].java.srcDirs)
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])

                artifact(shadowJar)
                artifact(sourcesJar.get())
                groupId = project.group as String
                artifactId = artifactId
                version = project.version as String
            }
        }
    }
}


fun findProperty(s: String) = project.findProperty(s) as String?

bintray {
    user = System.getenv("BINTRAY_USER")
    key = System.getenv("BINTRAY_API_KEY")
    publish = true
    setPublications("mavenJava")
    pkg(
        delegateClosureOf<BintrayExtension.PackageConfig> {
            repo = "either"
            name = artifactId
            vcsUrl = "https://github.com/sphrak/either.git"
            version(
                delegateClosureOf<BintrayExtension.VersionConfig> {
                    name = project.version as String
                }
            )
        }
    )
}

tasks {

    val ktlint by creating(JavaExec::class) {
        group = "verification"
        description = "Check Kotlin code style."
        classpath = configurations["ktlint"]
        main = "com.pinterest.ktlint.Main"
        args = listOf("src/**/*.kt")
    }

    "check" {
        dependsOn(ktlint)
    }

    create("ktlintFormat", JavaExec::class) {
        group = "formatting"
        description = "Fix Kotlin code style deviations."
        classpath = configurations["ktlint"]
        main = "com.pinterest.ktlint.Main"
        args = listOf("-F", "src/**/*.kt")
    }
}

tasks.dokkaHtml.configure {
    outputDirectory.set(File("docs"))

    dokkaSourceSets {
        named("main") {
            noAndroidSdkLink.set(false)
        }
    }
}

tasks.dokkaJekyll.configure {
    outputDirectory.set(File("docs"))

    dokkaSourceSets {
        named("main") {
            noAndroidSdkLink.set(false)
        }
    }
}
