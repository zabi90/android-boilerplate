package com.example.android.base

import androidx.fragment.app.Fragment
import com.example.android.AndroidApp


abstract class BaseFragment : Fragment() {

    val Fragment.app: AndroidApp
        get() = activity?.application as AndroidApp


    private val loadingFragment: LoadingFragment = LoadingFragment()

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