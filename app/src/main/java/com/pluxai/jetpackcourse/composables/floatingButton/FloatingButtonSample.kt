package com.pluxai.jetpackcourse.composables.floatingButton

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.pluxai.jetpackcourse.composables.dialog.showToast

@Composable
fun FloatingButtonSample() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd) {
        ExtendedFloatingActionButton(
            onClick = {
                showToast(
                    mContext = context,
                    text = "Tapped"
                )
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Floating button icon"
                )
            },
            text = {
                Text("ABC")
            },
            modifier = Modifier.padding(15.dp)
        )
    }
}