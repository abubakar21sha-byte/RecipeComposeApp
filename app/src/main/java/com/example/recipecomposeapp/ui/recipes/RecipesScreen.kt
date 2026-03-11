package com.example.recipecomposeapp.ui.recipes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.recipecomposeapp.R
import com.example.recipecomposeapp.core.ui.components.ScreenHeader

@Composable
fun RecipesScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        ScreenHeader(
            title = "Рецепты",
            imagePainter = painterResource(R.drawable.bcg_recipes_list)
        )
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Text("Скоро здесь будет список рецептов")
        }
    }
}