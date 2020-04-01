package com.example.android.ui.activities

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.android.R
import com.example.android.base.BaseActivity
import com.example.android.injection.ViewModelFactory
import com.example.android.viewmodels.MainViewModel
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel:MainViewModel
    //region Activity overrides methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]
    }
    // endregion

    //region Base class and interface override methods
    override fun inject() {
        component.inject(this)
    }

    override fun setListeners() {

    }
    //endregion
}
