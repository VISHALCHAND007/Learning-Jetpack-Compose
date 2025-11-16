package com.pluxai.jetpackcourse.composables.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.pluxai.jetpackcourse.composables.dialog.showToast
import kotlinx.coroutines.launch

@Composable
fun SnackBarSample() {
    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState = snackBarHostState
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {
                    scope.launch {
                        snackBarHostState.showSnackbar(
                            message = "Message of the snack bar.",
                            duration = SnackbarDuration.Indefinite,
                            actionLabel = "Action required",
                            withDismissAction = true
                        ).let { result ->
                            when(result) {
                                SnackbarResult.ActionPerformed -> {
                                    showToast(
                                        mContext = context,
                                        text = "Action is tapped."
                                    )
                                }
                                SnackbarResult.Dismissed -> {

                                }
                            }
                        }
                    }
                },
                text = {Text("Click to see snackbar")},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Image,
                        contentDescription = "Image Icon"
                    )
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
        ) {

        }
    }
}