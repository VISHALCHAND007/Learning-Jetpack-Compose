package com.pluxai.jetpackcourse.composables.menus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.pluxai.jetpackcourse.composables.dialog.showToast

@Composable
fun MenuSample() {
    val context = LocalContext.current
    var expandedState by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {
        Box(
            modifier = Modifier
                .padding(16.dp),
        ) {
            IconButton(
                onClick = {
                    expandedState = !expandedState
                }
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Menu dots"
                )
            }

            //Expanded state UI
            DropdownMenu(
                expanded = expandedState,
                onDismissRequest = {
                    expandedState = false
                }
            ) {
                DropdownMenuItem(
                    onClick = {
                        //do something
                        showToast(
                            mContext = context,
                            text = "Profile"
                        )
                    },
                    text = { Text("Profile") },
                    leadingIcon = {
                        Icon(imageVector = Icons.Outlined.Person, contentDescription = "profile")
                    }
                )

                DropdownMenuItem(
                    text = {Text("Settings")},
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "Settings"
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings"
                        )
                    }
                )
                HorizontalDivider()

                DropdownMenuItem(
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "Send feedback."
                        )
                    },
                    text = {Text("Send Feedback")},
                    leadingIcon = {
                        Icon(
                            contentDescription = "Send feedback",
                            imageVector = Icons.Outlined.Build
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Send,
                            contentDescription = "Send Icon"
                        )
                    }
                )

                HorizontalDivider()

                DropdownMenuItem(
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "About"
                        )
                    },
                    text = {Text("About")},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Info,
                            contentDescription = "About"
                        )
                    }
                )
                DropdownMenuItem(
                    onClick = {
                        showToast(
                            mContext = context,
                            text = "Help"
                        )
                    },
                    text = {Text("Help")},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.ThumbUp,
                            contentDescription = "Help"
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Help Trailing Icons"
                        )
                    }
                )
            }
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun MenuPreview() {
//    MenuSample()
//}