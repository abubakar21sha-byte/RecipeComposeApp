package com.example.recipecomposeapp.core.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import com.example.recipecomposeapp.core.ui.theme.Dimens
import com.example.recipecomposeapp.core.ui.theme.Dimens.ScreenHeaderFontSize
import com.example.recipecomposeapp.core.ui.theme.Dimens.ScreenHeaderHeight
import com.example.recipecomposeapp.core.ui.theme.RecipeColors

@Composable
fun ScreenHeader(
    title: String,
    imagePainter: Painter
) {
    Box(
        modifier = Modifier.fillMaxWidth().height(ScreenHeaderHeight),
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.Crop
        )
        Surface(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(Dimens.PaddingMain),
            color = RecipeColors.White,
            shape = RoundedCornerShape(Dimens.RoundedCornerMedium)
        ) {
            Text(
                text = title,
                Modifier.padding(Dimens.PaddingMedium),
                fontSize = ScreenHeaderFontSize,
                color = RecipeColors.TitleColor
            )
        }
    }
}