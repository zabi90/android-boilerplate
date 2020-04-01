package com.example.android.viewmodels

import androidx.lifecycle.viewModelScope
import com.example.android.base.BaseViewModel
import com.example.android.repositories.UserRepository
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(private val userRepository: UserRepository) : BaseViewModel() {

    fun loadFeeds(){
        viewModelScope.launch {
            try {
                loading.postValue(true)
                val feeds = userRepository.loadFeeds()
                loading.postValue(false)
            }catch (exception:Exception){
                Timber.d("Error while loading feeds ${exception.message}")
                loading.postValue(false)
            }
        }
    }
}