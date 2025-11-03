package com.pluxai.jetpackcourse.composables.core_components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun Button() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            //        1. Filled Button // for high emphasis
            Button(onClick = {
                Toast.makeText(context, "Clicked.", Toast.LENGTH_LONG).show()
            }) {
                Text("Filled Button")
            }
//        2. Tonal Button : for cart buttons etc.
            FilledTonalButton(onClick = {
                Toast.makeText(context, "Clicked.", Toast.LENGTH_LONG).show()
            }) {
                Text("Tonal Button")
            }
//        3. Text Button: for back and cancel buttons.
            TextButton(onClick = {
                Toast.makeText(context, "Clicked.", Toast.LENGTH_LONG).show()
            }) {
                Text("Text button")
            }
//        4. Outlined Button: for low emphasis
            OutlinedButton(onClick = {
                Toast.makeText(context, "Clicked.", Toast.LENGTH_LONG).show()
            }) {
                Text("Outlined Button")
            }
//        5. Elevated Button: for low emphasis
            ElevatedButton(onClick = {
                Toast.makeText(context, "Clicked.", Toast.LENGTH_LONG).show()
            }) {
                Text("Elevated btn")
            }
        }
    }
}