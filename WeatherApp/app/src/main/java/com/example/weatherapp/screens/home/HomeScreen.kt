package com.example.weatherapp.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccessibilityNew
import androidx.compose.material.icons.rounded.Air
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.model.City
import com.example.weatherapp.model.Clouds
import com.example.weatherapp.model.Coord
import com.example.weatherapp.model.Main
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.model.Sys
import com.example.weatherapp.model.Weather
import com.example.weatherapp.model.WeatherObject
import com.example.weatherapp.model.Wind

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    rootObject: RootObject
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = rootObject.city.name,
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Rounded.Search,
                            contentDescription = "search"
                        )
                    }
                }
            )
        }
    ) {
        MainContent(rootObject, it)
    }
}

@Composable
fun MainContent(
    rootObject: RootObject,
    paddingValues: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.weight(3f))

        Column(
            modifier = Modifier
                .weight(8f)
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = rootObject.list[0].main.temp.toString().split(".")[0],
                    fontSize = 68.sp
                )

                Text(
                    modifier = Modifier.padding(top = 9.dp),
                    text = "c"
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 9.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End
                ) {
                    Wight(
                        data = "     ${rootObject.list[0].main.humidity} ",
                        Icons.Rounded.Air
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Wight(
                        data = "  ${rootObject.list[0].main.feels_like}".split(".")[0] + " C",
                        Icons.Rounded.AccessibilityNew
                    )
                }
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = rootObject.list[0].weather[0].main,
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    Wight(
                        data = rootObject.list[0].main.temp_max.toString().split(".")[0],
                        icon = Icons.Rounded.ArrowUpward,
                        color = Color.Transparent,
                        padding = 0.dp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Wight(
                        data = rootObject.list[0].main.temp_min.toString().split(".")[0],
                        icon = Icons.Rounded.ArrowDownward,
                        color = Color.Transparent,
                        padding = 0.dp
                    )
                }
            }
        }
    }
}


@Composable
fun Wight(
    data: String,
    icon: ImageVector,
    color: Color = Color.LightGray,
    padding: Dp = 5.dp,
) {
    Surface(
        shape = Shapes().medium,
        color = color,
    ) {
        Row(
            modifier = Modifier.padding(padding)
        ) {
            Icon(imageVector = icon, contentDescription = "icon")
            Text(text = data)
        }
    }
}


@Preview
@Composable
private fun Preview() {
    HomeScreen(
        navController = rememberNavController(),
        rootObject = RootObject(
            cod = "200",
            message = 0,
            cnt = 7,
            list = listOf(
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
                    dt_txt = "1691074800"
                )
            ),
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
    )
}