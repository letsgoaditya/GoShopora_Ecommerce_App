package com.learning.ecommerceapp.screens.navigation

import com.learning.ecommerceapp.screens.navigation.Screens.Cart.route

sealed class Screens(val route: String) {
    // Define screen routes for navigation in Compose
// Each object represents a screen in the app's nav graph
    object Cart : Screens("Cart")

    object ProductDetails : Screens("product_details/{productId}") {
        fun createRoute(productId: String) = "product_details/$productId"
    }

    object Profile : Screens("Profile")

    object ProductList : Screens("product_list/{categoryId}") {
        fun createRoute(categoryId: String) = "product_list/$categoryId"
    }

    object CategoryList : Screens("category_list")
    object Login : Screens("Login")
    object SignUp : Screens("SignUp")
    object Home : Screens("Home")


}