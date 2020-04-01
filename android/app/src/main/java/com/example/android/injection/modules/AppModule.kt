package com.example.android.injection.modules

import android.content.Context
import com.example.android.AndroidApp
import com.example.android.injection.AppContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule constructor(private val app: AndroidApp) {

    @Singleton
    @Provides
    fun provideApp(): AndroidApp = app

    @Provides
    @AppContext
    fun provideContext(): Context {
        return app.applicationContext
    }

}