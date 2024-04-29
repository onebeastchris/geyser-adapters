plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("io.papermc.paperweight:paperweight-userdev:1.6.3")
    implementation("com.github.johnrengelman", "shadow", "8.1.1")
}

repositories {
    gradlePluginPortal()
}
