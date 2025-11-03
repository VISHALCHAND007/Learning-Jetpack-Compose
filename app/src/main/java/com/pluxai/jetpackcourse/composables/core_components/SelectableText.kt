package com.pluxai.jetpackcourse.composables.core_components

import android.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun SelectableText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        SelectionContainer {
            Column {
                Text("This one is selectable")
                Text("This one too")
                Text("Similarly this one")
                DisableSelection {
                    Text("This one is not selectable")
                }
            }
        }
    }
}

@Composable
fun AnnotatedStringWithUrl() {
    val uriHandler = LocalUriHandler.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
//        Text(
//            text = buildAnnotatedString {
//                append("Build better apps with ")
//                val link = LinkAnnotation.Url(
//                    "https://developer.android.com/develop/ui/compose/documentation",
//                    TextLinkStyles(
//                        SpanStyle(
//                            color = Color.Blue
//                        )
//                    )
//                ) {
//                    val url = (it as LinkAnnotation.Url).url
//                    uriHandler.openUri(url)
//                }
//                withLink(link) {
//                    append("Jetpack Compose")
//                }
//            }
//        )

        Text(
            text = buildAnnotatedString {
                append("Jetpack Compose:")
                val link = LinkAnnotation.Url(
                    url = "https://developer.android.com/develop/ui/compose/documentation",
                    styles = TextLinkStyles(
                        SpanStyle(color = Color.Blue)
                    )
                ) {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }

                withLink(link) {
                    append("Link")
                }
            }
        )
    }
}