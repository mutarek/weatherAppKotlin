package com.example.kotlin_weather_app.core.retrofit

import com.example.kotlin_weather_app.config.ApiConstant.Companion.BASE_URL
import com.example.kotlin_weather_app.core.api_service.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}