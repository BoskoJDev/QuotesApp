package com.example.quotesapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitMenadzer
{
    fun retrofitObjekat(): Retrofit = Retrofit.Builder().baseUrl("https://quotable.io/")
        .addConverterFactory(GsonConverterFactory.create()).build()
}