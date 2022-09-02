 package com.example.tag

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var i = 0
        val show = findViewById<Button>(R.id.button)
        val obraz = findViewById<ImageView>(R.id.imageView)
        show.setOnClickListener {
            if(i == 0){
                obraz.setImageResource(R.drawable.sosa)
                i = 1
            }else{
                obraz.setImageResource(R.drawable.white)
                i = 0
            }
        }

    }
}