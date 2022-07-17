package com.example.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.countUp_button)
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
    }
    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Rolled " + randomInt.toString()
    }
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            var count = resultText.text.toString().toInt()
            if(count != 6) {
                count++
            }
                resultText.text = count.toString()
        }
    }
}