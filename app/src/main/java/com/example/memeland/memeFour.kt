package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memeFour : AppCompatActivity() {
    lateinit var tvNext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_four)
        tvNext = findViewById(R.id.textView4)
        tvNext.setOnClickListener {
            val intent = Intent(this, MemeFive::class.java)
            startActivity(intent)
        }
        lateinit var tvBack: TextView
        tvBack = findViewById(R.id.textView9)
        tvBack.setOnClickListener {
            var intent = Intent(this, memeThree::class.java)
            startActivity(intent)
        }
    }
}