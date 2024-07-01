package com.example.kotlin_weather_app.core.api_service

import com.example.kotlin_weather_app.config.ApiConstant
import com.example.kotlin_weather_app.features.weather.models.PostModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(ApiConstant.BASE_URL)
    suspend fun getAllPost(
    ): PostModel
}