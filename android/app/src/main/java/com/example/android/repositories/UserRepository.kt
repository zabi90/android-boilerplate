package com.example.android.repositories

import com.example.android.network.services.UserService
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

class UserRepository @Inject constructor(private val userService: UserService) {

    suspend fun loadFeeds() = coroutineScope{
        val feeds = userService.loadUsers()
    }
}