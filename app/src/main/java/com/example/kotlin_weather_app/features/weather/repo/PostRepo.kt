package com.example.kotlin_weather_app.features.weather.repo

import com.example.kotlin_weather_app.core.retrofit.RetrofitInstance
import com.example.kotlin_weather_app.features.weather.models.PostModel

class PostRepo {
    suspend fun getAllPosts(): PostModel {
        return RetrofitInstance.api.getAllPost()
    }

}