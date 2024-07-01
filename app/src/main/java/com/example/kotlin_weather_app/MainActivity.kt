package com.example.kotlin_weather_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_weather_app.features.weather.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: PostViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(PostViewModel::class.java)


        viewModel.allPosts.observe(this, Observer { weather ->
            // Update the UI with weather data
            findViewById<TextView>(R.id.sampleTextView).text = weather.toString()
        })

        viewModel.fetchPosts();
    }
}