package com.learning.ecommerceapp.repositories

import android.widget.Toast
import com.learning.ecommerceapp.model.Product
import com.learning.ecommerceapp.room.CartDAO
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CartRepository @Inject constructor(private val cartDAO: CartDAO) {
    val allCartItems: Flow<List<Product>> = cartDAO.getAllCartItems()

    suspend fun addToCart(product: Product) {
        val existingItem = cartDAO.getCartItemById(product.id)

        if (existingItem != null) {
            println("Product Already added to cart . repository making call")
            cartDAO.updateCartItem(product)
        } else {
            cartDAO.insertCartItem(product)
        }


    }

    suspend fun removeCartItem(product: Product) {
        cartDAO.deleteCartItem(product)
    }

    suspend fun clearCart() {
        cartDAO.clearCart()
    }


}