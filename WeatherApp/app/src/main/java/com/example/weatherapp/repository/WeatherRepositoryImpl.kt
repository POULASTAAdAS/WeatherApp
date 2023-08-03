package com.example.weatherapp.repository

import com.example.weatherapp.data.DataOrException
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.network.WeatherApi
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi
) : WeatherRepository {

    override suspend fun getWeather(city: String?): DataOrException<RootObject, Boolean, Exception> {
        val result = try {
            if (city.isNullOrBlank()) weatherApi.getWeather()
            else weatherApi.getWeather(city = city)
        } catch (e: Exception) {
            return DataOrException(e = e)
        }
        return DataOrException(data = result)
    }
}