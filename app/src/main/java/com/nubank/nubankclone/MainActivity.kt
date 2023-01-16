package com.nubank.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nubank.nubankclone.adapter.AdapterPagamento
import com.nubank.nubankclone.adapter.AdapterProduto
import com.nubank.nubankclone.databinding.ActivityMainBinding
import com.nubank.nubankclone.model.Pagamento
import com.nubank.nubankclone.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaProduto: MutableList<Produto> = mutableListOf()
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconesPagamento = binding.recyclerIconesPagamento
        recyclerIconesPagamento.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconesPagamento.adapter = adapterPagamento
        listaIconesPagamento()

        val recyclerProduto = binding.recyclerProdutos
        recyclerProduto.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProduto.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProduto.adapter = adapterProduto
        listaTextoInformativo()
    }

    private fun listaIconesPagamento() {
        val icone1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar  \n Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icone4)

        val icone5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_recarga_celular, "Recarga de celular")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)
    }

    private fun listaTextoInformativo(){
        val textoInformativo1 = Produto("Participe da Promoção Tudo no Roxinho e concorra a...")
        listaProduto.add(textoInformativo1)

        val textoInformativo2 = Produto("Chegou o débito automático da fatura do cartão")
        listaProduto.add(textoInformativo2)

        val textoInformativo3 = Produto("Conheça a conta PJ: prática e livre de burocrácia para se...")
        listaProduto.add(textoInformativo3)

        val textoInformativo4 = Produto("Salve seus amigos da burocrácia: Faça um convite...")
        listaProduto.add(textoInformativo4)
    }
}