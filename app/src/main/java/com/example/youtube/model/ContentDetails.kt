package com.example.youtube.model


import com.google.gson.annotations.SerializedName

data class ContentDetails(
    @SerializedName("itemCount")
    val itemCount: Int
)