// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    extra.apply {
        set("compose_version", "1.0.0")
        set("kotlin_version", "1.4.20")
        set("compileSdkVersion", 31)
        set("targetSdkVersion", 31)
        set("minSdkVersion", 23)

        // Tutorial dependency versions
        set("appcompat_version", "1.2.0")
        set("constraint_layout_version", "2.0.4")
        set("junit_version", "4.13")
        set("google_truth_version", "1.0")
        set("mockito_version", "3.5.15")
        set("mockwebserver_version", "4.9.0")
        set("robolectric_version", "4.4")
        set("androidx_junit_version", "1.1.2")
        set("androidx_core_testing_version", "2.1.0")
        set("coroutines_test_version", "1.4.2")
        set("espresso_version", "3.3.0")
        set("fragment_testing_version", "1.2.5")
        set("room_version", "2.2.5")
        set("rxjava_version", "2.2.19")
        set("rxkotlin_version", "2.4.0")
        set("rxandroid_version", "2.1.1")
        set("hilt_version", "2.33-beta")
        set("nav_version", "2.3.2")
        set("retrofit_version", "2.9.0")
        set("okHttp_version", "4.9.0")
        set("moshi_converter_version", "2.9.0")
        set("moshi_version", "1.10.0")
        set("glide_version", "4.11.0")
        set("material_version", "1.2.1")
        set("threetenabp_version", "1.2.4")
        set("threetenbp_version", "1.4.4")
        set("leakcanary_version", "2.4")
        set("timber_version", "4.7.1")
    }

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${rootProject.extra.get("kotlin_version")}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${rootProject.extra.get("hilt_version")}")

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${rootProject.extra.get("nav_version")}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
