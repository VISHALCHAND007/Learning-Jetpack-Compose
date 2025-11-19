package com.pluxai.jetpackcourse.composables.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationExample() {
    val navController = rememberNavController()
    NavHost (navController = navController, startDestination = Navigation.Main) {
        navigation<Navigation.Main>(startDestination = Route.Home) {
            composable<Route.Home> {
                HomeScreen(navController)
            }
            composable<Route.WishList> {
                WishListScreen(navController)
            }
        }
    }
}