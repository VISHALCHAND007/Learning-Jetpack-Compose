package com.pluxai.jetpackcourse.composables.navigation

import kotlinx.serialization.Serializable

sealed class Navigation {
    @Serializable
    object Main : Navigation()
}

sealed class Route {
    @Serializable
    object Home: Route()

    @Serializable
    object WishList: Route()
}
