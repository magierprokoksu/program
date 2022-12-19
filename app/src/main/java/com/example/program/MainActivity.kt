package com.example.program

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.przycisk).setOnClickListener {
            var a=findViewById<EditText>(R.id.tekst).text.toString().toInt()
            var b=2
            val c = mutableListOf<String>()

            while (a>1){

                while (a%b==0){
                    val b2 = b.toString()
                    c += b2
                    a /= b
                }
                b+=1
            }
            findViewById<TextView>(R.id.jeden).text= c.toString()
        }
    }
}