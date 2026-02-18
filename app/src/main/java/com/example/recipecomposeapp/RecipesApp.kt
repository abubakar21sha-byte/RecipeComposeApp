package com.example.recipecomposeapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipecomposeapp.ui.theme.RecipeComposeAppTheme

@Composable
fun RecipesApp() {
    RecipeComposeAppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
            HomeScreen(modifier = Modifier.padding(paddingValues))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipesAppPreview() {
    RecipesApp()
}