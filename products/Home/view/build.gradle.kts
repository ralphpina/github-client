import net.ralphpina.build.TestDeps
import net.ralphpina.build.AndroidTestDeps
import net.ralphpina.build.Deps

plugins {
    id("com.android.library")
    id("net.ralphpina.build.android")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(Deps.ANDROIDX_APP_COMPAT)
    implementation(Deps.ANDROIDX_CORE)
    implementation(Deps.ANDROIDX_LIFECYCLE_VIEWMODEL_KTX)
    implementation(Deps.MATERIAL)
}