package com.pluxai.jetpackcourse.composables.bottomNavBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bottombar.AnimatedBottomBar
import com.example.bottombar.components.BottomBarItem
import com.example.bottombar.model.IndicatorDirection
import com.example.bottombar.model.IndicatorStyle

data class BottomNavItem(
    val title: String, val icon: ImageVector, val route: String
)

@Composable
fun BottomNavigationBarSample() {
    val paddingDefaults = WindowInsets.systemBars.asPaddingValues()
    var selectedItemIndex by remember { mutableIntStateOf(0) }
    val bottomBarItems = listOf(
        BottomNavItem(title = "Home", icon = Icons.Default.Home, route = "Home"),
        BottomNavItem(title = "Wishlist", icon = Icons.Default.Favorite, route = "Wishlist"),
        BottomNavItem(title = "Cart", icon = Icons.Default.ShoppingCart, route = "Cart"),
        BottomNavItem(title = "Profile", icon = Icons.Default.Person, route = "Profile"),
    )

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = paddingDefaults.calculateBottomPadding())
                    .background(color = Color.Transparent)
            ) {
                AnimatedBottomBar(
                    selectedItem = selectedItemIndex,
                    itemSize = bottomBarItems.size,
                    containerColor = Color.Transparent,
                    indicatorColor = MaterialTheme.colorScheme.primary,
                    indicatorStyle = IndicatorStyle.LINE,
                    indicatorDirection = IndicatorDirection.TOP
                ) {
                    bottomBarItems.forEachIndexed { index, item ->
                        BottomBarItem(
                            modifier = Modifier.align(alignment = Alignment.Top),
                            imageVector = item.icon,
                            selected = selectedItemIndex == index,
                            onClick = { selectedItemIndex = index },
                            label = item.title
                        )
                    }
                }
            }
        }) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

        }
    }
}