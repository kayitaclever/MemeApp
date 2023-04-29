package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNext=findViewById(R.id.textView8)
        tvNext.setOnClickListener {
            val intent=Intent(this,memeTwo::class.java)
            startActivity(intent)
        }
    }
}