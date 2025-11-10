package com.pluxai.jetpackcourse.composables.navigationDrawer

import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerItem(
    val title: String,
    val icon: ImageVector,
    val route: String
)
