package com.example.weatherapp.repository

import com.example.weatherapp.data.DataOrException
import com.example.weatherapp.model.RootObject

interface WeatherRepository {
    suspend fun getWeather(city: String? = null): DataOrException<RootObject, Boolean, Exception>
}