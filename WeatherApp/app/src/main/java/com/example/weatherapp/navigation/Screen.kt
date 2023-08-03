package com.example.weatherapp.navigation

sealed class Screen(val route: String){
    data object HomeScreen: Screen(route = "home_screen")
    data object SearchScreen: Screen(route = "search_screen")
    data object EmptyScreen: Screen(route = "empty_screen")
}