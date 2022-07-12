package com.soniaraujo.cestafeiraapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soniaraujo.cestafeiraapp.databinding.CardLayoutBinding
import com.soniaraujo.cestafeiraapp.model.Produto


class ProdutoAdapter : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>(){

    private var listProduto = emptyList<Produto>()

    class ProdutoViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        return ProdutoViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = listProduto[position]

        holder.binding.editTextNomeProd.text = produto.nomeProduto
        holder.binding.editTextValor.text = produto.valor.toString()
    }

    override fun getItemCount(): Int {
        return listProduto.size
    }


    fun setList(list: List<Produto>){
        listProduto = list
        notifyDataSetChanged()
    }
}