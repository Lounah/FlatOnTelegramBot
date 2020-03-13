import org.jetbrains.kotlin.gradle.plugin.*
import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

val props = Properties().apply {
    project.file("../gradle.properties").inputStream().use { load(it) }
}

val kotlinVersion: String = props.getProperty("kotlinVersion")

sourceSets["main"].withConvention(KotlinSourceSet::class) { kotlin.srcDirs("src") }
