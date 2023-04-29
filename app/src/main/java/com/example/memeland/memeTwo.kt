package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeTwo : AppCompatActivity() {
    lateinit var tvNext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        tvNext=findViewById(R.id.textView2)
        tvNext.setOnClickListener {
            var intent=Intent(this,memeThree::class.java)
            startActivity(intent)

        }
     lateinit var tvBack:TextView
     tvBack=findViewById(R.id.textView3)
     tvBack.setOnClickListener {
         var intent=Intent(this,MainActivity::class.java)
         startActivity(intent)

     }
    }
}