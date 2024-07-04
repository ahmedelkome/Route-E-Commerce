package com.route.route_e_commerce.ui.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.route.route_e_commerce.ui.utils.ViewMessage

class BaseViewModel : ViewModel() {
    var loadingLiveData = MutableLiveData<Boolean>()
    var errorMessage = MutableLiveData<ViewMessage>()
}