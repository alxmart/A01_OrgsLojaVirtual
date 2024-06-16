package com.luizafmartinez.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luizafmartinez.a01_orgslojavirtual.R
import com.luizafmartinez.a01_orgslojavirtual.model.Produto
import com.luizafmartinez.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto(
                    nome = "Teste",
                    descricao = "Teste descrição",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 1",
                    descricao = "Teste descrição 1",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste2",
                    descricao = "Teste descrição 2",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 3",
                    descricao = "Teste descrição 3",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste 4",
                    descricao = "Teste descrição 4",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 5",
                    descricao = "Teste descrição 5",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste6",
                    descricao = "Teste descrição 6",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 7",
                    descricao = "Teste descrição 7",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste 8",
                    descricao = "Teste descrição 8",
                    valor = BigDecimal("29.99")
                ),
                Produto(
                    nome = "Teste 9",
                    descricao = "Teste descrição 9",
                    valor = BigDecimal("19.99")
                ),
                Produto(
                    nome = "Teste 10",
                    descricao = "Teste descrição 10",
                    valor = BigDecimal("29.99")
                )
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)

        /*val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maçã"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"*/

        //Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_LONG).show()
        //val view = View(this)
        /* val view = TextView(this)
         view.setText("Cesta de frutas")
         setContentView(view)*/
    }
}


