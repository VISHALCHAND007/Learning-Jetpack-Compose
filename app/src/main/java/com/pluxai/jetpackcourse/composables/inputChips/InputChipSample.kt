package com.pluxai.jetpackcourse.composables.inputChips

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputChipSample() {
    var chipState by remember {
        mutableStateOf(true)
    }

    if (chipState) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            InputChip(
                selected = chipState,
                onClick = {
                    chipState = !chipState
                },
                avatar = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Person",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize)
                    )
                },
                label = {
                    Text("Enabled")
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowInputChipPreview() {
    InputChipSample()
}
