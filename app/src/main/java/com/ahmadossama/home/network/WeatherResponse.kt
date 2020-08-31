package com.ahmadossama.home.network

import com.google.gson.annotations.SerializedName

data class WeatherResponse (

    @SerializedName("name")
    val cityName: String,
    @SerializedName("main")
    val weatherData: WeatherData,
    @SerializedName("weather")
    val weatherList: List<WeatherStatus>
)


data class WeatherData(
    @SerializedName("temp")
    val temp: Float,
    @SerializedName("pressure")
    val pressure : Float,
    @SerializedName("humidity")
    val humidity: Float,
    @SerializedName("temp_min")
    val minTemp: Float,
    @SerializedName("temp_max")
    val maxTemp: Float
)

data class WeatherStatus(
    @SerializedName("main")
    val Status: String,
    @SerializedName("description")
    val description: String

)