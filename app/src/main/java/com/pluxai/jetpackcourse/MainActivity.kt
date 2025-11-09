package com.pluxai.jetpackcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pluxai.jetpackcourse.composables.checkbox.CheckBoxSample
import com.pluxai.jetpackcourse.composables.dialog.DialogWithImage
import com.pluxai.jetpackcourse.composables.floatingButton.FloatingButtonSample
import com.pluxai.jetpackcourse.composables.inputChips.InputChipSample
import com.pluxai.jetpackcourse.composables.menus.MenuSample
import com.pluxai.jetpackcourse.ui.theme.JetpackCourseTheme

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
//                BottomSheetExample()
//                CardSample()
//                CheckBoxSample()
//                InputChipSample()
//                DialogWithImage()
//                FloatingButtonSample()
                MenuSample()
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