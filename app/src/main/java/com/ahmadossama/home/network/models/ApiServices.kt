package com.ahmadossama.home.network.models

import com.ahmadossama.home.network.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("/weather")
    @Query("q")
    fun getWeatherByCity(    @Query("q") cityNmae: String,
                             @Query("appid")  apiKey: String,
    ): Call<WeatherResponse>
}