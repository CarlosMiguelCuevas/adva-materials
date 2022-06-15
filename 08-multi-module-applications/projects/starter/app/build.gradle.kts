plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(rootProject.extra.get("compileSdkVersion") as Int)

    defaultConfig {
        applicationId = "com.raywenderlich.android.petsave"
        minSdkVersion(rootProject.extra.get("minSdkVersion") as Int)
        targetSdkVersion(rootProject.extra.get("targetSdkVersion") as Int)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled  = false
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }

    packagingOptions {
        excludes.add("META-INF/AL2.0")
        excludes.add("META-INF/LGPL2.1")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Modules
    implementation(project (":features:animalsnearyou"))
    implementation(project (":features:search"))
    implementation(project (":common"))
    implementation(project (":logging"))

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${rootProject.extra.get("kotlin_version")}")

    // Support Libraries and material
    implementation("androidx.appcompat:appcompat:${rootProject.extra.get("appcompat_version")}")
    implementation("com.google.android.material:material:${rootProject.extra.get("material_version")}")

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:${rootProject.extra.get("nav_version")}")
    implementation("androidx.navigation:navigation-ui-ktx:${rootProject.extra.get("nav_version")}")

    // DI
    implementation("com.google.dagger:hilt-android:${rootProject.extra.get("hilt_version")}")

    kapt("com.google.dagger:hilt-android-compiler:${rootProject.extra.get("hilt_version")}")

    // Needed for DI to work properly
    implementation("com.squareup.retrofit2:retrofit:${rootProject.extra.get("retrofit_version")}")
    implementation("com.squareup.okhttp3:logging-interceptor:${rootProject.extra.get("okHttp_version")}")
    implementation("androidx.room:room-runtime:${rootProject.extra.get("room_version")}")
    implementation("io.reactivex.rxjava2:rxjava:${rootProject.extra.get("rxjava_version")}")
}
