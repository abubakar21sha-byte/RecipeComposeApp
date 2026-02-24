package com.example.recipecomposeapp.core.ui.navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipecomposeapp.core.ui.theme.Dimens.PaddingLarge
import com.example.recipecomposeapp.core.ui.theme.Dimens.PaddingSmall
import com.example.recipecomposeapp.core.ui.theme.Dimens.RoundedCornerMedium
import com.example.recipecomposeapp.core.ui.theme.RecipeColors

@Composable
fun BottomNavigation(
    onCategoriesClick: () -> Unit,
    onFavoriteClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(bottom = PaddingLarge),
    ) {
        BottomNavigationItem(
            text = "Категории",
            onClick = onCategoriesClick,
            modifier = Modifier.weight(1f),
            color = RecipeColors.Blue
        )

        Spacer(modifier = Modifier.width(PaddingSmall))

        BottomNavigationItem(
            text = "Избранное",
            onClick = onFavoriteClick,
            modifier = Modifier.weight(1f),
            color = RecipeColors.Red
        )
    }
}

@Composable
fun BottomNavigationItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = RecipeColors.Blue
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = color),
        shape = RoundedCornerShape(RoundedCornerMedium)
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
fun BottomNavigationPreview() {
    BottomNavigation(
        onCategoriesClick = {},
        onFavoriteClick = {}
    )
}