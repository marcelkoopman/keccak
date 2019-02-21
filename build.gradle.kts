plugins {
    application
    kotlin("jvm") version "1.3.20"
}

application {
    mainClassName = "main.kotlin.MainKt"
}

dependencies {
    compile(kotlin("stdlib"))
    compile("org.bouncycastle:bcprov-jdk15on:1.61")

}

repositories {
    jcenter()
}