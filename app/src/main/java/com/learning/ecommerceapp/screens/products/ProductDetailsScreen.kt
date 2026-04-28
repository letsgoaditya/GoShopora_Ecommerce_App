package com.learning.ecommerceapp.screens.products


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import coil3.compose.rememberAsyncImagePainter
import com.learning.ecommerceapp.model.Product
import com.learning.ecommerceapp.viewmodels.CartViewModel
import com.learning.ecommerceapp.viewmodels.ProductDetailsViewModel
import com.learning.ecommerceapp.viewmodels.ProductViewModel

@Composable
fun ProductDetailsScreen(
    productId: String,
    productDetailsViewModel: ProductDetailsViewModel = hiltViewModel(),
    cartViewModel: CartViewModel=hiltViewModel()
) {

    LaunchedEffect(productId) {
        productDetailsViewModel.fetchProductDetails(productId)
    }

    val productState = productDetailsViewModel.product.collectAsState()
    val product = productState.value


//    val dummyProduct = Product(
//        "1",
//        "Smartphone",
//        499.67,
//        "data:image/jpeg;base64,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"
//    )

    if (product == null) {
        Text("Product not Found")
    } else {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top=50.dp)
                .padding(16.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(
                    model = product.imageUrl
                ),
                contentDescription = "Product Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(shape = RoundedCornerShape(4.dp))

            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = product.name,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "$${product.price}",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = product.categoryId ?: "No description found",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }
        IconButton(
            onClick = {  /* Handle Add to cart event */
                cartViewModel.addToCart(product)
            },
            modifier = Modifier
                .padding(top=50.dp)
                .padding(16.dp)
                .background(color = MaterialTheme.colorScheme.primary, shape = CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Add to Cart",
                tint = Color.White
            )
        }
    }

}