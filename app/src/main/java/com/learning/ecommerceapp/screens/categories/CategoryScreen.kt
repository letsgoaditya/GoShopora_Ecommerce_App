package com.learning.ecommerceapp.screens.categories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavController
import com.learning.ecommerceapp.model.Category
import com.learning.ecommerceapp.screens.navigation.Screens
import com.learning.ecommerceapp.viewmodels.CategoryViewModel

@Composable
fun CategoryScreen(
    navController: NavController,
    categoryViewModel: CategoryViewModel = hiltViewModel(),
    onCartClick: () -> Unit={},
    onProfileClick: () -> Unit={},

) {

    val categoriesState = categoryViewModel.categories.collectAsState()
    val categories = categoriesState.value


//    val categories = listOf(
//        Category(
//            1,
//            "Electronics",
//            "https://cdn-icons-png.flaticon.com/128/12539/12539860.png"
//        ),
//        Category(2, "Clothing", "https://cdn-icons-png.flaticon.com/128/7417/7417708.png")
//    )

    Column(modifier = Modifier.padding(top=50.dp)

    ) {
        if (categories.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "No Categories found! ",
                    style = MaterialTheme.typography.bodyLarge

                )
            }
        } else {
            Text(
                text = "Categories",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(
                    horizontal = 16.dp, vertical = 8.dp
                )
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                items(categories) { category ->
                    CategoryItem(category, {
                        // navController.navigate(/*Handle the click event on category*/)
                        navController.navigate(
                            Screens.ProductList.createRoute(category.id.toString())
                        )
                    })
                }

            }
        }

    }


}