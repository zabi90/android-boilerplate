package com.example.android.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import com.example.android.R
import com.example.android.base.BaseActivity
import com.example.android.base.BaseViewModel
import com.example.android.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : BaseActivity() {


    private val viewModel:MainViewModel by viewModels()
    //region Activity overrides methods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.loadFeeds().observe(this, {
            titleTextView.text = it.toString()
        })
    }
    // endregion

    //region Base class and interface override methods
    override fun setListeners() {

    }

    override fun setViewModel(): BaseViewModel {
       return viewModel
    }
    //endregion
}
