package com.route.route_e_commerce.ui.base.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.route.route_e_commerce.R
import com.route.route_e_commerce.ui.base.viewmodel.BaseViewModel

abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {
    var dialog: AlertDialog? = null
    lateinit var binding: DB
    val viewModel: BaseViewModel by viewModels<BaseViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, getlayout())
        binding.lifecycleOwner = this
        observeLiveData()
    }

    open fun observeLiveData() {
        viewModel.loadingLiveData.observe(this) {it->
            if (it) {
                showLoading()
            } else {
                hideLoading()
            }
        }
        viewModel.errorMessage.observe(this){it->
            showError(
                it.title,
                it.message,
                it.posTitle,
                it.posBtn,
                it.nagiTitle,
                it.nagiBtn
            )
        }
    }

    abstract fun getlayout(): Int

    private fun showLoading() {
        dialog = AlertDialog.Builder(this).setView(
            R.layout.loading_progress
        ).create()
        dialog?.show()
    }

    private fun hideLoading() {
        dialog?.dismiss()
    }

    private fun showError(title:String,
                          message:String,
                          posTitle:String,
                          posBtn: (()-> Unit)?=null,
                          nagiTitle:String,
                          nagiBtn:(()->Unit)?=null
                          ){
        val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(posTitle){dialog,p1->
                dialog.dismiss()
                posBtn?.invoke()
            }
            .setNegativeButton(nagiTitle) { dialog, p1 ->
                dialog.dismiss()
                nagiBtn?.invoke()
            }
            .create().show()
    }
}