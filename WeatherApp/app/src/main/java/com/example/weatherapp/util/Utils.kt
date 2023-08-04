package com.example.weatherapp.util

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.East
import androidx.compose.material.icons.rounded.North
import androidx.compose.material.icons.rounded.NorthEast
import androidx.compose.material.icons.rounded.South
import androidx.compose.material.icons.rounded.SouthEast
import androidx.compose.material.icons.rounded.West
import com.example.weatherapp.model.RootObject
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
fun formatDate(timestamp: Int): String {
    val sdf = SimpleDateFormat("EEE, MMM d")
    val date = java.util.Date(timestamp.toLong() * 1000)

    return sdf.format(date)
}

@SuppressLint("SimpleDateFormat")
fun formatDateTime(timestamp: Int): String {
    val sdf = SimpleDateFormat("hh aa")
    val date = java.util.Date(timestamp.toLong() * 1000)

    return sdf.format(date)
}

fun returnMaxTemp(
    rootObject: RootObject,
    index: Int
): String {
    val array = ArrayList<Int>()

    for (i in index..index + 8) {
        array.add(rootObject.list[i].main.feels_like.toInt())
    }

    return array.max().toString()
}

fun returnMinTemp(
    rootObject: RootObject,
    index: Int
): String {
    val array = ArrayList<Int>()

    for (i in index..index + 8) {
        array.add(rootObject.list[i].main.feels_like.toInt())
    }

    return array.min().toString()
}


fun calculateDirection(degree: Int) =
    when (degree) {
        in 331..360, in 0..30 -> "N"
        in 31..70 -> "NE"
        in 71..110 -> "E"
        in 111..165 -> "SE"
        in 167..210 -> "S"
        in 211..255 -> "SW"
        in 256..290 -> "W"
        else -> "NW"
    }

fun getIcon(direction: String) =
    when (direction) {
        "N" -> Icons.Rounded.North
        "NE" -> Icons.Rounded.NorthEast
        "E" -> Icons.Rounded.East
        "SE" -> Icons.Rounded.SouthEast
        "S" -> Icons.Rounded.South
        "W" -> Icons.Rounded.West
        else -> Icons.Rounded.NorthEast
    }
