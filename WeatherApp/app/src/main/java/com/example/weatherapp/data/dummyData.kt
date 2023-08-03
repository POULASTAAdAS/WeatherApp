package com.example.weatherapp.data

import com.example.weatherapp.model.City
import com.example.weatherapp.model.Clouds
import com.example.weatherapp.model.Coord
import com.example.weatherapp.model.Main
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.model.Sys
import com.example.weatherapp.model.Weather
import com.example.weatherapp.model.WeatherObject
import com.example.weatherapp.model.Wind

fun dummyData() = RootObject(
    cod = "200",
    message = 0,
    cnt = 7,
    list = weatherObject(),
    city = City(
        coord = Coord(
            lat = 22.23,
            lon = 88.32
        ),
        country = "IN",
        id = 1,
        name = "Kolkata",
        population = 393232,
        sunrise = 32139,
        sunset = 90900,
        timezone = 10
    )
)

fun weatherObject() = listOf(
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ), WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ), WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ), WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ), WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    ),
    WeatherObject(
        dt = 1691064000,
        main = Main(
            temp = 30.46,
            feels_like = 36.73,
            temp_min = 29.2,
            temp_max = 30.46,
            pressure = 1000,
            sea_level = 1000,
            grnd_level = 1000,
            humidity = 72,
            temp_kf = 1.26
        ),
        weather = listOf(
            Weather(
                id = 1,
                description = "overcast clouds",
                main = "Haze",
                icon = "0d"
            )
        ),
        clouds = Clouds(all = 82),
        wind = Wind(
            speed = 6.0,
            deg = 180,
            gust = 9.23
        ),
        visibility = 10000,
        pop = 0.01,
        sys = Sys(pod = "d"),
        dt_txt = "2023-08-03 21:00:00"
    )
)