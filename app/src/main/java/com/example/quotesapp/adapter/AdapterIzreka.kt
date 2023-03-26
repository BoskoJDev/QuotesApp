package com.example.quotesapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quotesapp.R
import com.example.quotesapp.modeli.ListaIzreka

class AdapterIzreka(private var kontekst: Context) : RecyclerView.Adapter<AdapterIzreka.DrzacPogleda>()
{
    private lateinit var izreke: ListaIzreka

    fun setIzreke(izreke: ListaIzreka)
    {
        this.izreke = izreke
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrzacPogleda
    {
        return DrzacPogleda(LayoutInflater.from(this.kontekst).inflate(R.layout.izreka, parent, false))
    }

    override fun onBindViewHolder(holder: DrzacPogleda, position: Int)
    {
        val izreka = this.izreke.results[position]
        holder.autorIzreke.text = izreka.author
        holder.datumAzuriranja.text = "Date modified: " + izreka.dateModified
        holder.datumObjave.text = "Date added: " + izreka.dateAdded
        holder.tagovi.text = "Tags: " + izreka.tags.toString()

        holder.izreka.text = izreka.content
    }

    override fun getItemCount(): Int = this.izreke.count

    class DrzacPogleda(view: View) : RecyclerView.ViewHolder(view)
    {
        val datumObjave = view.findViewById<TextView>(R.id.DatumObjave)!!
        val datumAzuriranja = view.findViewById<TextView>(R.id.DatumAzuriranja)!!
        val autorIzreke = view.findViewById<TextView>(R.id.Autor)!!
        val izreka = view.findViewById<TextView>(R.id.Izreka)!!
        val tagovi = view.findViewById<TextView>(R.id.Tagovi)!!
    }
}