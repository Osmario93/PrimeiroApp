package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var lang : Boolean = false
    fun onClickTraduzir(view: View) {
        //Essa função traduz o texto "Hello World!" para português
        var txtBox : TextView = findViewById(R.id.textView)
        if(!lang){
            lang = true
            txtBox.text = "Ola Mundo!"
        } else {
            lang = false
            txtBox.text = "Hello World!"
        }

    }
}