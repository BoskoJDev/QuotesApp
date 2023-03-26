package com.example.quotesapp.modeli

/*Nazivi atributa klase moraju odgovarati nazivima atributa JSON objekta ciji ce podaci biti
skladisteni u njoj*/
data class Rezultat(
    val _id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int,
    val tags: List<String>
)