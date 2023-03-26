package com.example.quotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quotesapp.adapter.AdapterIzreka
import com.example.quotesapp.modeli.IzrekeApi
import com.example.quotesapp.modeli.ListaIzreka
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterIzreka = AdapterIzreka(this@MainActivity)
        val lista = findViewById<RecyclerView>(R.id.ListaIzreka)
        lista.layoutManager = GridLayoutManager(this@MainActivity, 1)
        val izrekeApi = RetrofitMenadzer.retrofitObjekat().create(IzrekeApi::class.java)
        val poziv = izrekeApi.izreke()
        poziv.enqueue(object : Callback<ListaIzreka> {
            override fun onResponse(call: Call<ListaIzreka>, response: Response<ListaIzreka>)
            {
                val izreke = response.body()!!
                adapterIzreka.setIzreke(izreke)
                lista.adapter = adapterIzreka
            }

            override fun onFailure(call: Call<ListaIzreka>, t: Throwable) {}
        })
    }
}