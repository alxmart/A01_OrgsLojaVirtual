package com.luizafmartinez.a01_orgslojavirtual

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.luizafmartinez.a01_orgslojavirtual.R
import com.luizafmartinez.a01_orgslojavirtual.ListaProdutosAdapter

class MainActivity : Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()



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


