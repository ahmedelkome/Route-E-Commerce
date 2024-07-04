package com.route.route_e_commerce.ui.auth.fragment.login

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.route.route_e_commerce.R
import com.route.route_e_commerce.databinding.FragmentLoginBinding
import com.route.route_e_commerce.ui.base.fargment.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding>(){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.register.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
    override fun getLayout(): Int = R.layout.fragment_login
}