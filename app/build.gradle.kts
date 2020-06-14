import net.ralphpina.build.TestDeps
import net.ralphpina.build.AndroidTestDeps
import net.ralphpina.build.Deps

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(30)

        applicationId = "net.ralphpina.githubclient"
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(Deps.ANDROIDX_APP_COMPAT)
    implementation(Deps.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(Deps.ANDROIDX_CORE)
    implementation(Deps.ANDROIDX_NAV_FRAGMENT)
    implementation(Deps.ANDROIDX_NAV_FRAGMENT_KTX)
    implementation(Deps.ANDROIDX_NAV_UI)
    implementation(Deps.ANDROIDX_NAV_UI_KTX)
    implementation(Deps.ANDROIDX_LIFECYCLE_LIVEDATA_KTX)
    implementation(Deps.ANDROIDX_LIFECYCLE_VIEWMODEL_KTX)
    implementation(Deps.MATERIAL)

    testImplementation(TestDeps.JUNIT)
    androidTestImplementation(AndroidTestDeps.ESPRESSO_CORE)
    androidTestImplementation(AndroidTestDeps.JUNIT_EXT)
}