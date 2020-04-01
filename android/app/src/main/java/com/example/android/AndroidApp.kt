package com.example.android

import android.app.Application
import com.example.android.injection.components.DaggerApplicationComponent
import com.example.android.injection.modules.AppModule
import timber.log.Timber

class AndroidApp : Application() {

    val appComponent by lazy {
        DaggerApplicationComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}