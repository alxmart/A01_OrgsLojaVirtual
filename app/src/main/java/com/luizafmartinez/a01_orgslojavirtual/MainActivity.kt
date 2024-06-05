package com.luizafmartinez.a01_orgslojavirtual

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_LONG).show()
        //val view = View(this)
        val view = TextView(this)
        view.setText("Cesta de frutas")
        setContentView(view)
        //setContentView(R.layout.activity_main)
    }
}


