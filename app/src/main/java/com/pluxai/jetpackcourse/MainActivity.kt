package com.pluxai.jetpackcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pluxai.jetpackcourse.composables.animation.AnimationSample
import com.pluxai.jetpackcourse.composables.badges.BadgesSample
import com.pluxai.jetpackcourse.composables.bottomNavBar.BottomNavigationBarSample
import com.pluxai.jetpackcourse.composables.datePicker.DatePickerExample
import com.pluxai.jetpackcourse.composables.navigation.HomeScreen
import com.pluxai.jetpackcourse.composables.navigation.NavigationExample
import com.pluxai.jetpackcourse.composables.slider.SliderSample
import com.pluxai.jetpackcourse.composables.segmentedBtn.SegmentedButtonSample
import com.pluxai.jetpackcourse.composables.snackbar.SnackBarSample
import com.pluxai.jetpackcourse.composables.switchExample.SwitchExample
import com.pluxai.jetpackcourse.composables.timePicker.TimePickerExample
import com.pluxai.jetpackcourse.composables.topBar.TopAppBarSample
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
//                PullToRefSample2()
//                SearchBarExample()
//                SegmentedButtonSample()
//                SliderSample()
//                SnackBarSample()
//                BadgesSample()
//                SwitchExample()
//                DatePickerExample()
//                TimePickerExample()
//                BottomNavigationBarSample()
//                TopAppBarSample()
//                NavigationExample()
//                NavigationExample()
                AnimationSample()
            }
        }
    }
    companion object {
        const val WALK = "Walk"
        const val RIDE = "Ride"
        const val DRIVE = "Drive"
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