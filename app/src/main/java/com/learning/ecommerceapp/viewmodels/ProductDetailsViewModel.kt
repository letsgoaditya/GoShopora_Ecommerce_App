package com.learning.ecommerceapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learning.ecommerceapp.model.Product
import com.learning.ecommerceapp.repositories.FirestoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ProductDetailsViewModel @Inject constructor(private val repository: FirestoreRepository) :
    ViewModel() {

    private val _product = MutableStateFlow<Product?>(null)
    val product: StateFlow<Product?> get() = _product


     fun fetchProductDetails(productId: String) {
        viewModelScope.launch {
            try {
                val product = repository.getProductsById(productId)
                _product.value = product
            } catch (e: Exception) {
                println("Error fetching product details in viewmodel product details: ${e.message}")
            }
        }
    }


}