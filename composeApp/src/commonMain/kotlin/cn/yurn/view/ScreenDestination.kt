package cn.yurn.view

import kotlinx.serialization.Serializable

sealed class ScreenDestination {
    @Serializable
    data object Home: ScreenDestination()
    @Serializable
    data object Loading: ScreenDestination()
}