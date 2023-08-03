package com.example.weatherapp.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weatherapp.data.DataOrException
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.screens.home.HomeScreen
import com.example.weatherapp.viewmodel.SharedViewModel

@Composable
fun Navigation(
    navController: NavHostController,
    startDestination: String,
    sharedViewModel: SharedViewModel
) {
    val weatherData =
        produceState<DataOrException<RootObject, Boolean, Exception>>(
            initialValue = DataOrException(loading = true)
        ) {
            value = sharedViewModel.getWeatherData()
        }.value


    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.HomeScreen.route) {

            if (weatherData.loading == true) {
                CircularProgressIndicator()
            } else {
                HomeScreen(
                    navController = navController,
                    rootObject = weatherData.data!!
                )
            }
        }

        composable(route = Screen.EmptyScreen.route) {

        }
    }
}


@Composable
fun EmptyScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Data not found",
            fontWeight = FontWeight.Light,
            fontSize = MaterialTheme.typography.titleMedium.fontSize
        )
    }
}