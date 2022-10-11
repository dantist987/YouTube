package com.example.youtube.di

import com.example.youtube.network.provideApi
import com.example.youtube.network.provideOkHttp
import com.example.youtube.network.provideRetrofit
import com.example.youtube.repository.Repository
import com.example.youtube.ui.fragments.playLists.PlaylistsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val youTubeAppModule = module {

    single {
        provideRetrofit(get())
    }

    factory {
        provideOkHttp()
    }

    single {
        provideApi(get())
    }

    single {
        Repository(get())
    }

    viewModel {
        PlaylistsViewModel(get())
    }

}