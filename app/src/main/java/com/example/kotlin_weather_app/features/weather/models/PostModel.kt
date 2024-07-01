package com.example.kotlin_weather_app.features.weather.models

import com.google.gson.annotations.SerializedName


data class PostModel (

    @SerializedName("userId" )
    var userId : Int?    = null,
    @SerializedName("id"     )
    var id     : Int?    = null,
    @SerializedName("title"  )
    var title  : String? = null,
    @SerializedName("body"   )
    var body   : String? = null

)
