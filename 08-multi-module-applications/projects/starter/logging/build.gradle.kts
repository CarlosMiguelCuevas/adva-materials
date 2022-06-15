plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(rootProject.extra.get("compileSdkVersion") as Int)

    defaultConfig {
        minSdkVersion(rootProject.extra.get("minSdkVersion") as Int)
        targetSdkVersion(rootProject.extra.get("targetSdkVersion") as Int)
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${rootProject.extra.get("kotlin_version")}")
    implementation("com.jakewharton.timber:timber:${rootProject.extra.get("timber_version")}")
}

