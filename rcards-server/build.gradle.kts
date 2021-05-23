plugins {
    kotlin("jvm") version "1.5.0"
}

group = "com.github.bennylut"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // kotlin
    implementation(kotlin("stdlib"))

    // database
    implementation("com.h2database:h2:1.4.200")

    // orm
    val exposedVersion: String by project
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")

    // rest service
    implementation("io.ktor:ktor-server-core:1.5.4")
    implementation("io.ktor:ktor-server-netty:1.5.4")

    // logs
    implementation("ch.qos.logback:logback-classic:1.2.3")
}
