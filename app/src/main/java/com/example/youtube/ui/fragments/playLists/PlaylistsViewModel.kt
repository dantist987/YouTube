package com.example.youtube.ui.fragments.playLists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.youtube.core.Resource
import com.example.youtube.core.UIState
import com.example.youtube.model.YouTubeApiResponse
import com.example.youtube.repository.Repository

class PlaylistsViewModel(private val repository: Repository) : ViewModel() {

    private val _playlists: MutableLiveData<UIState<YouTubeApiResponse>> = MutableLiveData()

    val playlists = _playlists as LiveData<UIState<YouTubeApiResponse>>

    fun fetchPlaylists() {
        when (val responce = repository.fetchPlaylists().value) {
            is Resource.Loading -> {
                _playlists.value = UIState.Loading()
            }
            is Resource.Error -> {
                _playlists.value = UIState.Error(responce.message ?: "Unknown error")
            }
            is Resource.Success -> {
                if (responce.data != null) {
                    _playlists.value = UIState.Success(responce.data)
                }
            }
            else -> _playlists.value = UIState.Error(responce?.message ?: "Unknown error")
        }
    }

}