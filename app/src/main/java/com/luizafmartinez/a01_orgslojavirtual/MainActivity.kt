package com.luizafmartinez.a01_orgslojavirtual

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maçã"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"

        //Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_LONG).show()
        //val view = View(this)
       /* val view = TextView(this)
        view.setText("Cesta de frutas")
        setContentView(view)*/
    }
}


