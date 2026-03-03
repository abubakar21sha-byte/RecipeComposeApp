package com.example.recipecomposeapp.ui.favorites

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.recipecomposeapp.R
import com.example.recipecomposeapp.core.ui.components.ScreenHeader

@Composable
fun FavoritesScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        ScreenHeader(
            title = "Избранное",
            imageRes = R.drawable.bcg_favorites
        )
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Text("Здесь будут отображаться избранные рецепты")
        }
    }
}