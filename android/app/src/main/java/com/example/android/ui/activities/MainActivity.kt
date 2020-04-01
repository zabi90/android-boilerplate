package com.example.android.ui.activities

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.R
import com.example.android.base.BaseActivity
import com.example.android.base.BaseViewModel
import com.example.android.extensions.toast
import com.example.android.injection.ViewModelFactory
import com.example.android.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel:MainViewModel
    //region Activity overrides methods
    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]
        viewModel.loadFeeds().observe(this, Observer {
            titleTextView.text = it.toString()
        })
    }
    // endregion

    //region Base class and interface override methods
    override fun inject() {
        component.inject(this)
    }

    override fun setListeners() {

    }

    override fun setViewModel(): BaseViewModel? {
       return viewModel
    }
    //endregion
}
