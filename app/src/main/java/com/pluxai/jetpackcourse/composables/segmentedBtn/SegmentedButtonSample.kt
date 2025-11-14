package com.pluxai.jetpackcourse.composables.segmentedBtn

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pluxai.jetpackcourse.MainActivity

@Composable
fun SegmentedButtonSample() {
    val selectedOptions = remember { mutableStateListOf(false, false, false) }
    val options = remember {
        listOf(
            MainActivity.WALK,
            MainActivity.RIDE,
            MainActivity.DRIVE
        )
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        MultiChoiceSegmentedButtonRow {
            options.forEachIndexed { index, label ->
                SegmentedButton(
                    checked = selectedOptions[index],
                    onCheckedChange = {
                        selectedOptions[index] = !selectedOptions[index]
                    },
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),
                    icon = {
                        SegmentedButtonDefaults.Icon(active = selectedOptions[index])
                    },
                    label = {
                        when (label) {
                            MainActivity.WALK -> {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Default.DirectionsWalk,
                                    contentDescription = label
                                )
                            }

                            MainActivity.RIDE -> {
                                Icon(
                                    imageVector = Icons.Default.DirectionsBus,
                                    contentDescription = label
                                )
                            }

                            MainActivity.DRIVE -> {
                                Icon(
                                    imageVector = Icons.Default.DirectionsCar,
                                    contentDescription = label
                                )
                            }
                        }
                    }
                )
            }
        }
    }

}



