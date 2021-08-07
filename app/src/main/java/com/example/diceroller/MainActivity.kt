package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button  = findViewById(R.id.roll_button)

        rollButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"hello world !" , Toast.LENGTH_SHORT).show()
            rollDice ()
        })
    }

    fun rollDice () {

        val random = java.util.Random().nextInt(6)
        val drawbleResource = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 }

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawbleResource)
        }


    }
