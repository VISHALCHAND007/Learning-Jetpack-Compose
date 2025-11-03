package com.pluxai.jetpackcourse.composables.core_components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun SimpleOutlinedTextField() {
    var text by remember {
        mutableStateOf("")
    }

    val brush = remember {
        Brush.linearGradient(listOf(Color.Gray, Color.Red, Color.Cyan, Color.Blue, Color.Magenta))
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {Text("Username")},
            textStyle = TextStyle( brush = brush)
        )
    }
}

@Composable
fun PasswordTextField() {
    var password by rememberSaveable {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {Text("Enter password")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions (
                keyboardType = KeyboardType.Password
            )
        )
    }
}