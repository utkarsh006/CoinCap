plugins {
    id("coincap.android.library")
    id("coincap.kotlin.detekt")
    kotlin("kapt")
    id("coincap.android.hilt")
}

android {
    namespace = "com.client.coincap.core.domain"

    detekt {
        config = files("$rootDir/app/config/detekt/config.yml")
        parallel = true
        buildUponDefaultConfig = true
        autoCorrect = true
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:data"))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}
