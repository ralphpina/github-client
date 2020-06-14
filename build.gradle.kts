// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        // Duplicated in root/buildSrc/build.gradle.kts
        classpath("com.android.tools.build:gradle:4.2.0-alpha01")
        classpath(kotlin("gradle-plugin", version = "1.3.72"))

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
