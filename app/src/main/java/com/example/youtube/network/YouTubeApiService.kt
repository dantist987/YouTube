package com.example.youtube.network

import com.example.youtube.model.YouTubeApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {

    @GET("playlists")
    fun fetchPlaylists(
        @Query("part") part: String,
        @Query("channelId") id: String,
        @Query("maxResults") maxResults: Int,
        @Query("key") apiKey: String
    ): Response<YouTubeApiResponse>

}