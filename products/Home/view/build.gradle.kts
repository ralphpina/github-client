import net.ralphpina.build.Deps

plugins {
    id("com.android.library")
    id("net.ralphpina.build.android")
    id("net.ralphpina.build.jetpack.componse")
}

// TODO (ralph) Ideally we can move this to buildSrc/.../Android.kt's JetpackComposePlugin
android {
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(Deps.ANDROIDX_APP_COMPAT)
    implementation(Deps.ANDROIDX_CORE)
    implementation(Deps.ANDROIDX_LIFECYCLE_VIEWMODEL_KTX)
    implementation(Deps.MATERIAL)
}