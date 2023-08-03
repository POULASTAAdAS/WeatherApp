package com.example.weatherapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.weatherapp.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
) : ViewModel() {

//    val weatherObject: MutableState<DataOrException<RootObject, Boolean, Exception>> =
//        mutableStateOf(DataOrException(null, true, Exception("")))
//
//
//    init {
//        getWeatherData()
//    }

    suspend fun getWeatherData() =
            weatherRepository.getWeather()
}