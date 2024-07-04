package com.route.route_e_commerce.ui.base.fargment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<DB:ViewDataBinding> : Fragment() {
    lateinit var binding:DB
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,getLayout(),container,false)
        binding.lifecycleOwner = this
        return binding.root
    }
    abstract fun getLayout():Int
}