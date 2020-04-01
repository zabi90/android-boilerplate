package com.example.android.base

import androidx.lifecycle.ViewModel
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException
import com.example.android.network.Error

open class BaseViewModel : ViewModel() {

    fun onHandleError(error: Throwable): Error {

        when (error) {
            is HttpException -> {

                return when {
                    error.code() == 404 -> {
                        Error(description = "Url not found.")
                    }
                    error.code() == 500 -> {

                        Error(description = "Internal server error")

                    }
                    else -> {
                        Error(description = error.message())
                    }
                }
            }
            is SocketTimeoutException -> return Error(description = "Problem occur with connecting server!")
            is IOException -> return Error(description = "You are offline. Please connect to internet connection.")
        }

        return Error(description = "Unknown error while processing request.")
    }
}