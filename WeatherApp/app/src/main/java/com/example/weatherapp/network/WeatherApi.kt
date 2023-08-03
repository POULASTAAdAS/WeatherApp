package com.example.weatherapp.network

import com.example.weatherapp.model.RootObject
import com.example.weatherapp.util.Constants.API_ID
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton


@Singleton
interface WeatherApi {

    @GET("data/2.5/forecast")
    suspend fun getWeather(
        @Query("q") city: String = "kolkata",

        @Query("cnt") cnt: String = "7",

        @Query("units") unit: String = "metric",

        @Query("appid") appid: String = API_ID

    ): RootObject
}