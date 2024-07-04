package com.route.route_e_commerce.ui.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import com.route.route_e_commerce.R
import com.route.route_e_commerce.databinding.ActivityAuthBinding
import com.route.route_e_commerce.ui.base.activity.BaseActivity


class AuthActivity : BaseActivity<ActivityAuthBinding>() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavGraph()
    }

    private fun initNavGraph() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun getlayout(): Int = R.layout.activity_auth


}