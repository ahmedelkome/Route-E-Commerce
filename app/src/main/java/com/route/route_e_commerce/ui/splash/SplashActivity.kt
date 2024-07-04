package com.route.route_e_commerce.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.route.route_e_commerce.R
import com.route.route_e_commerce.databinding.ActivitySplashBinding
import com.route.route_e_commerce.ui.auth.AuthActivity
import com.route.route_e_commerce.ui.base.activity.BaseActivity


class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        enableEdgeToEdge()
        Handler(mainLooper).postDelayed({
            val intent = Intent(this,AuthActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}