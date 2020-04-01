package com.example.android.injection.components

import com.example.android.AndroidApp
import com.example.android.ui.activities.MainActivity
import com.example.android.injection.modules.*
import dagger.Component

import javax.inject.Singleton


@Component(
    modules = [
        AppModule::class,
        RetrofitModule::class,
        NetworkModule::class,
        ViewModelModule::class,
        RepositoryModule::class,
        DataModule::class]
)
@Singleton
interface ApplicationComponent {

    fun inject(androidApp: AndroidApp)

    fun inject(mainActivity: MainActivity)


}
