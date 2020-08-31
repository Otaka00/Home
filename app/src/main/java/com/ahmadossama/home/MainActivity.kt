package com.ahmadossama.home

import android.net.DnsResolver
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmadossama.home.network.WeatherResponse
import com.ahmadossama.home.network.models.ApiServices
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private  val apiServices: ApiServices by Lazy {
        RetrofitClient.getClient().create(ApiServices::class.java)
    }
    private val apiKey by Lazy{"539d84bc553bcca9ca9064ae49010d42"}
    private var currentCityName="cairo"
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apiServices.getWeatherByCity(currentCityName, apiKey).enqueue(object : Callback<WeatherResponse>, response: Response<WeatherResponse>)


        }
fun bindWeatherData()
    }
}