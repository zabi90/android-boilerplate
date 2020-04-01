package com.example.android.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android.AndroidApp


abstract class BaseFragment : Fragment() {

    val Fragment.app: AndroidApp
        get() = activity?.application as AndroidApp

    val component by lazy {
        app.appComponent
    }
    private val loadingFragment: LoadingFragment = LoadingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
    }

    abstract fun inject()

    fun showLoading() {
        if (!loadingFragment.isAdded) {
            fragmentManager?.let {
                loadingFragment.show(it, "loading")
                loadingFragment.isCancelable = false
            }
        }
    }

    fun hideLoading() {
        if (loadingFragment.isAdded) {
            loadingFragment.dismiss()
        }
    }

}