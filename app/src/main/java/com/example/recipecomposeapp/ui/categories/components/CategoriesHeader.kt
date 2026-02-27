package com.example.recipecomposeapp.ui.categories.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipecomposeapp.R
import com.example.recipecomposeapp.core.ui.components.ScreenHeader

@Composable
fun CategoriesHeader() {
    ScreenHeader(
        title = "Категории",
        imageRes = R.drawable.bcg_categories
    )
}

@Preview(showBackground = true)
@Composable
fun CategoriesHeaderPreview() {
    CategoriesHeader()
}