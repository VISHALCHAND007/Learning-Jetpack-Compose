package com.pluxai.jetpackcourse.composables.core_components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

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