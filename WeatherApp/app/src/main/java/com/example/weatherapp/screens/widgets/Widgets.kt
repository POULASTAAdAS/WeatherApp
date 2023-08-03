package com.example.weatherapp.screens.widgets

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Cloud
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.weatherapp.data.dummyData
import com.example.weatherapp.data.weatherObject
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.model.WeatherObject
import com.example.weatherapp.util.formatDate
import com.example.weatherapp.util.formatDateTime

@Composable
fun Widgets(
    data: String,
    icon: ImageVector,
    color: Color = Color.LightGray,
    padding: Dp = 5.dp,
    iconColor: Color = Color.Black
) {
    Surface(
        shape = Shapes().medium,
        color = color,
    ) {
        Row(
            modifier = Modifier.padding(padding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "icon",
                tint = iconColor
            )
            Text(text = data)
        }
    }
}


@Composable
fun FiveDayForecast(
    rootObject: RootObject
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
        ) {
            Text(
                text = "5-Day Forecast",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            var i = 1
            val l = listOf(1, 8, 16, 24, 32, 40)

            Row {
                rootObject.list.forEach {
                    i++
                    if (i in l) {
                        SingleDay(
                            weaObject = it,
                            tempMax = "33",
                            tempMin = "22"
                        )

                        Spacer(modifier = Modifier.width(14.dp))
                    }
                }
            }
        }
    }
}


@Composable
private fun SingleDay(
    weaObject: WeatherObject,
    tempMax: String,
    tempMin: String
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = formatDate(weaObject.dt).split(",")[0])
        Text(text = formatDate(weaObject.dt).split(",")[1])

        Spacer(modifier = Modifier.height(5.dp))

        val imageUrl = "https://openweathermap.org/img/wn/${weaObject.weather[0].icon}.png"

        Icon(
            painter = rememberAsyncImagePainter(imageUrl), // weaObject.weather[0].icon
            contentDescription = "weather icon",
            modifier = Modifier.size(35.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = weaObject.weather[0].main)

        Spacer(modifier = Modifier.height(5.dp))


        Text(text = "${tempMax}ºC")

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "${tempMin}ºC")
    }
}


@Composable
fun ThreeHourForecast(
    weatherObjectList: List<WeatherObject>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            Text(text = "3-Hour Forecast")

            Spacer(modifier = Modifier.height(8.dp))

            Row {
                weatherObjectList.forEach {
                    SingleHour(
                        time = formatDateTime(it.dt),
                        main = "${it.main.temp.toInt()}ºC",
                        icon = it.weather[0].icon
                    )
                }
            }
        }
    }
}

@Composable
fun SingleHour(
    time: String,
    main: String,
    icon: String
) {
    val imageUrl = "https://openweathermap.org/img/wn/${icon}.png"

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = time)

        Spacer(modifier = Modifier.height(5.dp))

        Icon(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "weather icon",
            modifier = Modifier.size(35.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = main)
    }
}


@Preview
@Composable
private fun SevenDayForecastPreview() {
    FiveDayForecast(
        rootObject = dummyData()
    )
}

@Preview
@Composable
private fun ThreeHourForecastPreview() {
    ThreeHourForecast(
        weatherObjectList = weatherObject()
    )
}

@Preview
@Composable
private fun WidgetsPreview() {
    Widgets(
        data = "  24ºC ",
        icon = Icons.Rounded.Cloud
    )
}