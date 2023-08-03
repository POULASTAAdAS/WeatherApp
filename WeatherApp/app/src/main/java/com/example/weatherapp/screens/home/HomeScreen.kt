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
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.data.dummyData
import com.example.weatherapp.model.RootObject
import com.example.weatherapp.screens.widgets.FiveDayForecast
import com.example.weatherapp.screens.widgets.ThreeHourForecast
import com.example.weatherapp.screens.widgets.Widgets

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
                    text = "ºC"
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 9.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End
                ) {
                    Widgets(
                        data = "     ${rootObject.list[0].main.humidity} ",
                        Icons.Rounded.Air
                    )

                    Spacer(modifier = Modifier.height(5.dp))


                    val feelsLike = remember { mutableStateOf("36") }

                    LaunchedEffect(key1 = Unit) {
                        val maxTemp = ArrayList<Int>()
                        for (i in 1..8) {
                            maxTemp.add(rootObject.list[i].main.feels_like.toInt())
                        }

                        feelsLike.value = maxTemp.max().toString()
                    }

                    Widgets(
                        data = " ${feelsLike.value}ºC",
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
                    Widgets(
                        data = rootObject.list[0].main.temp_max.toString().split(".")[0],
                        icon = Icons.Rounded.ArrowUpward,
                        color = Color.Transparent,
                        padding = 0.dp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Widgets(
                        data = rootObject.list[0].main.temp_min.toString().split(".")[0],
                        icon = Icons.Rounded.ArrowDownward,
                        color = Color.Transparent,
                        padding = 0.dp
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                ThreeHourForecast(weatherObjectList = rootObject.list.subList(0, 8))

                Spacer(modifier = Modifier.height(20.dp))

                FiveDayForecast(rootObject = rootObject)
            }
        }
    }
}


@Preview
@Composable
private fun Preview() {
    HomeScreen(
        navController = rememberNavController(),
        rootObject = dummyData()
    )
}