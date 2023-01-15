package com.nubank.nubankclone.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nubank.nubankclone.model.Pagamento

class AdapterPagamento(private val context: Context, private val listaPagamento: MutableList<Pagamento>):
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class PagamentoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}