package com.pluxai.jetpackcourse.composables.core_components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.pluxai.jetpackcourse.R

@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 30.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.W700,
            fontStyle = FontStyle.Italic,
            style = TextStyle(
                shadow = Shadow(color = Color.Gray, blurRadius = 20f)
            )
        )
    }
}

@Composable
fun ColorfulString() {
    val colorList = listOf(
        Color.Gray,
        Color.Cyan,
        Color.Black,
        Color.Blue,
        Color.DarkGray,
        Color.Magenta,
        Color.Red,
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(colors = colorList),
                        fontSize = 25.sp,
                        fontWeight = FontWeight.W500
                    )
                ) {
                    append("Android Development is fun.")
                }
            },
        )
    }
}