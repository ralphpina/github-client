import net.ralphpina.build.TestDeps
import net.ralphpina.build.AndroidTestDeps
import net.ralphpina.build.Deps
import net.ralphpina.build.Products

plugins {
    id("com.android.application")
    id("net.ralphpina.build.android")
}

android {
    defaultConfig {
        applicationId = "net.ralphpina.githubclient"
    }
}

dependencies {
    api(project(Products.Home.View))

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

    implementation(Deps.KOIN_ANDROID)

    implementation(Deps.MATERIAL)

    testImplementation(TestDeps.JUNIT)
    androidTestImplementation(AndroidTestDeps.ESPRESSO_CORE)
    androidTestImplementation(AndroidTestDeps.JUNIT_EXT)
}