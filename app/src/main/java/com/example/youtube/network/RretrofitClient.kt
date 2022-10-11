package com.example.youtube.network

import com.example.youtube.BuildConfig.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

fun provideOkHttp(): OkHttpClient {

    val intrceptor = HttpLoggingInterceptor()
    intrceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    return OkHttpClient()
        .newBuilder()
        .addInterceptor(intrceptor)
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .build()

}

fun provideApi(retrofit: Retrofit): YouTubeApiService =
    retrofit.create(YouTubeApiService::class.java)