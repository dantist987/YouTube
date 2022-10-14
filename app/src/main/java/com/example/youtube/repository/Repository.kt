package com.example.youtube.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.youtube.BuildConfig.API_KEY
import com.example.youtube.core.Resource
import com.example.youtube.model.YouTubeApiResponse
import com.example.youtube.network.YouTubeApiService
import com.example.youtube.tools.Constasnts
import kotlinx.coroutines.Dispatchers

class Repository(private val youTubeApiService: YouTubeApiService) {

    fun fetchPlaylists(): LiveData<Resource<YouTubeApiResponse>> {

        return liveData(Dispatchers.IO) {
            emit(Resource.Loading())
            val response = youTubeApiService.fetchPlaylists(
                apiKey = API_KEY,
                part = Constasnts.PART,
                id = Constasnts.CHANNEL_ID,
                maxResults = Constasnts.MAX_RESULTS
            )

            if (response.isSuccessful && response.body() != null) {
                emit(Resource.Success(response.body()!!))
            } else {
                emit(Resource.Error(response.message()))
            }
        }
    }
}