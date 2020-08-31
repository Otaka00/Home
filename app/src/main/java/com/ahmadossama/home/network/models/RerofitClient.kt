package com.ahmadossama.home.network.models

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RerofitClient {
    private var instance: Retrofit?=null
    fun getClient(): Retrofit{
    if (instance ==null)
        instance =Retrofit.Builder().baseUrl("http://openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create()).client(
            OkHttpClient().newBuilder().build()).build()

        return instance!!

    }

}
