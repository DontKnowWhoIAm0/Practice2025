package com.example.practicetest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private val memList = listOf(
        "https://i.pinimg.com/736x/3e/da/84/3eda84fa14352340aa721649027594c0.jpg",
        "https://i.pinimg.com/736x/77/17/ff/7717ffca479f64c8935205079e0d9d4f.jpg",
        "https://i.pinimg.com/736x/4a/d9/91/4ad9910e0d3660dc41536f7d77dd9fd7.jpg",
        "https://i.pinimg.com/736x/9c/10/90/9c10907de3047ea026b1ed83a6086603.jpg",
        "https://i.pinimg.com/736x/08/63/73/086373439eac3f6ebed77221d24e4b82.jpg",
        "https://i.pinimg.com/1200x/eb/0e/78/eb0e780ecd23f5c644d88571411d27b2.jpg",
        "https://i.pinimg.com/736x/8a/6f/39/8a6f39e94bde2b8d5290e9045879a101.jpg",
        "https://i.pinimg.com/736x/1d/2c/4d/1d2c4da4764510a255956d283ef42bf3.jpg",
        "https://i.pinimg.com/736x/21/67/8d/21678db69cefeacdaac2be2cc50e8349.jpg",
        "https://i.pinimg.com/736x/d4/d1/8a/d4d18a8fa66aced79f6c05e7ec93adcc.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val buttonMem = findViewById<Button>(R.id.button1)
        val buttonNext = findViewById<Button>(R.id.button2)

        buttonMem.setOnClickListener {
            val index = (0..9).random()
            val mem = memList[index]
            Glide.with(this).load(mem).into(imageView)
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            Log.d("DEBUG", "Все ок")
            startActivity(intent)
        }
    }
}