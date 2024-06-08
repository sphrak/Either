import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`

plugins {
    `maven-publish`
}

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {

        // Stub javadoc.jar artifact
        artifact(tasks.register("${name}JavadocJar", Jar::class) {
            archiveClassifier.set("javadoc")
            archiveAppendix.set(this@withType.name)
        })

        // Provide artifacts information required by Maven Central
        pom {
            name.set("Either")
            description.set(" ☯\uFE0F Either type for Kotlin ")
            url.set("https://github.com/sphrak/either")

            developers {
                developer {
                    id.set("either")
                    name.set("Niclas Kron")
                    organization.set("")
                    organizationUrl.set("")
                }
            }
            scm {
                url.set("https://github.com/sphrak/either")
            }
        }
    }
}