package com.example.quotesapp.modeli

import retrofit2.Call
import retrofit2.http.GET

interface IzrekeApi
{
    @GET("/quotes")
    fun izreke() : Call<ListaIzreka>
}