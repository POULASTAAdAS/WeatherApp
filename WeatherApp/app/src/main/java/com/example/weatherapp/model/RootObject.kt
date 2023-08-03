package com.example.weatherapp.model

data class RootObject(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val list: List<WeatherObject>,
    val city: City
)