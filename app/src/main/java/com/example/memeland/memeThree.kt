package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeThree : AppCompatActivity() {
    lateinit var tvNext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        tvNext = findViewById(R.id.textView5)
        tvNext.setOnClickListener {
            val intent = Intent(this, memeFour::class.java)
            startActivity(intent)
        }
        lateinit var tvBack: TextView
        tvBack = findViewById(R.id.textView6)
        tvBack.setOnClickListener {
            var intent = Intent(this, memeTwo::class.java)
            startActivity(intent)
        }
    }
}