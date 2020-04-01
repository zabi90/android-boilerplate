package com.example.android.injection.modules

import com.example.android.network.services.UserService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named

@Module
class NetworkModule {
    @Provides
    fun getFeedsService(@Named(RetrofitModule.PUBLIC_CLIENT) retrofit: Retrofit): UserService {
        return retrofit.create(UserService::class.java)
    }
}