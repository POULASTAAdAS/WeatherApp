package com.example.weatherapp.model

data class Weather(
    val id: Int,
    val description: String,
    val main: String,
    val icon: String
)