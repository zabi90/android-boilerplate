package com.example.android.injection.modules

import com.example.android.network.services.UserService
import com.example.android.repositories.UserRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule{

    @Provides
    fun getFeedRepository(userService: UserService): UserRepository {
        return UserRepository(userService)
    }
}