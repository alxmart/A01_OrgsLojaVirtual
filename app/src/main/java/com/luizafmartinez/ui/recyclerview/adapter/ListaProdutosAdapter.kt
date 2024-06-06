package com.luizafmartinez.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.luizafmartinez.a01_orgslojavirtual.model.Produto


class ListaProdutosAdapter(
    private val produtos: List<Produto>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


    }

    // override fun getItemCount(): Int = produtos.size
    override fun getItemCount(): Int {
        return produtos.size
    }

}
