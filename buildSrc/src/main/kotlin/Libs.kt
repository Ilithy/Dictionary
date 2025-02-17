object Accompanist {
    private const val accompanistVersion = "0.22.0-rc"
    const val insets = "com.google.accompanist:accompanist-insets:$accompanistVersion"
}

object AndroidX {
    private const val activityVersion = "1.4.0"
    const val activity = "androidx.activity:activity-ktx:$activityVersion"
    const val activityCompose = "androidx.activity:activity-compose:$activityVersion"
}

object Classpath {
    private const val gradleVersion = "7.1.2"
    const val gradleClasspath = "com.android.tools.build:gradle:$gradleVersion"
    const val gradleKotlin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"
}

object Core {
    private const val coreVersion = "1.7.0"
    const val core = "androidx.core:core-ktx:$coreVersion"
}

object Coroutines {
    private const val coroutinesVersion = "1.6.0"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
}

object Compose {
    const val composeCompiler = "1.1.0"
    private const val composeVersion = "1.1.0"

    const val foundation = "androidx.compose.foundation:foundation:$composeVersion"
    const val icons = "androidx.compose.material:material-icons-extended:$composeVersion"
    const val material3 = "androidx.compose.material3:material3:1.0.0-alpha06"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"
}

object Hilt {
    private const val hiltVersion = "2.41"
    const val plugin = "dagger.hilt.android.plugin"
    const val classpath = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
    const val android = "com.google.dagger:hilt-android:$hiltVersion"
    const val compiler = "com.google.dagger:hilt-android-compiler:$hiltVersion"
}

object Excludes {
    const val exclude = "/META-INF/{AL2.0,LGPL2.1}"
}

object Lifecycle {
    private const val lifecycleVersion = "2.4.1"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val composeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
}

object Retrofit {
    private const val retrofitVersion = "2.9.0"
    const val core = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val gson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
}

object Room {
    private const val roomVersion = "2.4.2"
    const val runtime = "androidx.room:room-runtime:$roomVersion"
    const val compiler = "androidx.room:room-compiler:$roomVersion"
    const val ktx = "androidx.room:room-ktx:$roomVersion"
}

object Version {
    const val kotlinVersion = "1.6.10"
}