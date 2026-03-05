package com.example.recipecomposeapp.ui.categories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.recipecomposeapp.R
import com.example.recipecomposeapp.core.ui.components.ScreenHeader
import com.example.recipecomposeapp.ui.categories.components.CategoryItem

@Composable
fun CategoriesScreen(onRecipesClick: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        ScreenHeader(
            title = "Категории",
            imagePainter = painterResource(R.drawable.bcg_categories)
        )

        CategoryItem(onItemClick = onRecipesClick, title = "Бургеры")
    }
}

