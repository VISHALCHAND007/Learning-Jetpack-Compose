package com.pluxai.jetpackcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pluxai.jetpackcourse.composables.pullToRefresh.PullToRefSample2
import com.pluxai.jetpackcourse.composables.pullToRefresh.PullToRefreshExample
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
//                MenuSample()
//                ScaffoldSample()
//                NavigationDrawerSample()
//                ProgressIndicatorSample()
//                PullToRefreshExample()
                PullToRefSample2()
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