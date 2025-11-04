package com.pluxai.jetpackcourse.composables.core_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pluxai.jetpackcourse.R

@Composable
fun Image() {
    val colorList = remember {
        Brush.sweepGradient(
            listOf(
                Color.Gray,
                Color.Blue,
                Color.Black,
                Color.Red,
                Color.Magenta,
            )
        )
    }
    Image(
        painter = painterResource(R.drawable.skeleton),
        contentDescription = stringResource(R.string.skeleton),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.size(300.dp)
//            .clip(CircleShape)
            .border(BorderStroke(width = 3.dp, brush = colorList)),
        alignment = Alignment.Center,
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToSaturation(0f)
        })
    )
}

@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    Image()
}

@Composable
fun TextHyperlink() {
    val uriHandler = LocalUriHandler.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            buildAnnotatedString {
                append("Docs: ")
                val link = LinkAnnotation.Url(
                    "https://www.google.com",
                    styles = TextLinkStyles(
                        SpanStyle(color = Color.Blue)
                    )

                ) {
                    val uri = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(uri)
                }
                withLink(link) {
                    append("Link")
                }
            }
        )
    }


}