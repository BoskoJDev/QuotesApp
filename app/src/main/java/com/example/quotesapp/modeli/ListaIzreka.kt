package com.example.quotesapp.modeli

/*Nazivi atributa klase moraju odgovarati nazivima atributa JSON objekta ciji ce podaci biti
skladisteni u njoj*/
data class ListaIzreka(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<Rezultat>,
    val totalCount: Int,
    val totalPages: Int
)