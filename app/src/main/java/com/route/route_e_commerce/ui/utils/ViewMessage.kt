package com.route.route_e_commerce.ui.utils

data class ViewMessage (
    val title:String="",
    val message:String="",
    val posTitle:String="",
    val posBtn:(()->Unit),
    val nagiTitle:String="",
    val nagiBtn:(()->Unit)
){
}