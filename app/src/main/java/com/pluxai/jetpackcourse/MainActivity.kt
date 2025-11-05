package com.pluxai.jetpackcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.tooling.preview.Preview
import com.pluxai.jetpackcourse.composables.Greeting
import com.pluxai.jetpackcourse.composables.ImageWithText
import com.pluxai.jetpackcourse.composables.bottomSheet.BottomSheetExample
import com.pluxai.jetpackcourse.composables.core_components.AnnotatedStringWithUrl
import com.pluxai.jetpackcourse.composables.core_components.Button
import com.pluxai.jetpackcourse.composables.core_components.ColorfulString
import com.pluxai.jetpackcourse.composables.core_components.HorizontalScrollingText
import com.pluxai.jetpackcourse.composables.core_components.Image
import com.pluxai.jetpackcourse.composables.core_components.PasswordTextField
import com.pluxai.jetpackcourse.composables.core_components.SelectableText
import com.pluxai.jetpackcourse.composables.core_components.SimpleOutlinedTextField
import com.pluxai.jetpackcourse.composables.core_components.SimpleText
import com.pluxai.jetpackcourse.composables.core_components.TextEllipsis
import com.pluxai.jetpackcourse.composables.core_components.TextHyperlink
import com.pluxai.jetpackcourse.composables.layouts.BoxSample
import com.pluxai.jetpackcourse.composables.layouts.ColumnSample
import com.pluxai.jetpackcourse.composables.layouts.ConstraintLayoutSample
import com.pluxai.jetpackcourse.composables.layouts.LazyColumnSample
import com.pluxai.jetpackcourse.composables.layouts.LazyRowSample
import com.pluxai.jetpackcourse.composables.layouts.RowSample
import com.pluxai.jetpackcourse.ui.theme.JetpackCourseTheme
import javax.crypto.SecretKey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCourseTheme {
//                Greeting("Hello Vishal!!")
//                ImageWithText()
//                SimpleText()
//                ColorfulString()
//                HorizontalScrollingText()
//                TextEllipsis()
//                SimpleOutlinedTextField()
//                PasswordTextField()
//                SelectableText()
//                AnnotatedStringWithUrl()
//                TextHyperlink()
//                OpenUrl()
//                Button()
//                Image()
//                ColumnSample()
//                RowSample()
//                BoxSample()
//                ConstraintLayoutSample()
//                LazyColumnSample()
//                LazyRowSample()
                BottomSheetExample()
            }
        }
    }
}

//@Composable
//fun OpenUrl() {
//    val urlHandler = LocalUriHandler.current
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = buildAnnotatedString {
//                append("Documentation: ")
//                val link = LinkAnnotation.Url(
//                    url = "https://developer.android.com/develop/ui/compose/documentation",
//                    styles = TextLinkStyles(
//                        SpanStyle(
//                            color = Color.Blue
//                        )
//                    )
//                ) {
//                    val uri = (it as LinkAnnotation.Url).url
//                    urlHandler.openUri(uri)
//                }
//                withLink(link) {
//                    append("Link")
//                }
//            }
//        )
//    }
//}