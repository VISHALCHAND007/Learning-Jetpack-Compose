package com.pluxai.jetpackcourse.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.pluxai.jetpackcourse.R

@Composable
fun Greeting(text: String) {
    Text(
        text = text
    )
}

@Composable
fun ImageWithText() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = colorResource(R.color.black)),
        contentAlignment = Alignment.Center,

    ) {
        Column {
            Image(
                painter = painterResource(R.drawable.skeleton),
                contentDescription = stringResource(R.string.skeleton)
            )
            Text(
                text = stringResource(R.string.skeleton),
                color = colorResource(R.color.red),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowImagePreview() {
    ImageWithText()
}