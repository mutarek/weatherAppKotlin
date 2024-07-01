package com.example.kotlin_weather_app.features.weather.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_weather_app.features.weather.models.PostModel
import com.example.kotlin_weather_app.features.weather.repo.PostRepo
import kotlinx.coroutines.launch

class PostViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = PostRepo()

    private val posts = MutableLiveData<PostModel>()
    val allPosts: LiveData<PostModel> = posts

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val response = repository.getAllPosts()
                posts.postValue(response)
            } catch (e: Exception) {
                Log.e("WeatherViewModel", "Error fetching weather", e)
            }
        }
    }
}