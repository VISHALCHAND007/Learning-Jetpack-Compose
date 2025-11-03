package com.pluxai.jetpackcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pluxai.jetpackcourse.composables.Greeting
import com.pluxai.jetpackcourse.composables.ImageWithText
import com.pluxai.jetpackcourse.composables.core_components.ColorfulString
import com.pluxai.jetpackcourse.composables.core_components.HorizontalScrollingText
import com.pluxai.jetpackcourse.composables.core_components.PasswordTextField
import com.pluxai.jetpackcourse.composables.core_components.SelectableText
import com.pluxai.jetpackcourse.composables.core_components.SimpleOutlinedTextField
import com.pluxai.jetpackcourse.composables.core_components.SimpleText
import com.pluxai.jetpackcourse.composables.core_components.TextEllipsis
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
                SelectableText()
            }
        }
    }
}