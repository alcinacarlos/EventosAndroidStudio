package com.carlosalcina.cambiarfondo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.LinearLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundLayout = findViewById<LinearLayout>(R.id.background_layout)
        val buttonChangeBackground = findViewById<Button>(R.id.button_change_background)

        buttonChangeBackground.setOnClickListener {
            val color = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            backgroundLayout.setBackgroundColor(color)
        }
    }
}
