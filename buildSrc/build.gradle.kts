plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("AndroidBuildPlugin") {
            id = "net.ralphpina.build.android"
            implementationClass = "net.ralphpina.build.AndroidBuildPlugin"
        }
        register("JetpackComposePlugin") {
            id = "net.ralphpina.build.jetpack.componse"
            implementationClass = "net.ralphpina.build.JetpackComposePlugin"
        }
    }
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    implementation(gradleApi())

    // Duplicated in root/build.gradle.kts
    implementation("com.android.tools.build:gradle:4.2.0-alpha01")
    implementation(kotlin("gradle-plugin", version = "1.3.72"))

    implementation(kotlin("android-extensions"))
}