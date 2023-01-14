package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


/**
 * Это действие позволяет пользователю бросить кубик и просмотреть результат
 * на экране.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Бросьте кости и обновите экран результатом.
     */

    private fun rollDice() {

        // Создайте новый объект из кубиков с 6 сторонами и бросьте его
        val kubik = Kubik(6)
        val kubikRoll = kubik.roll()
        val kubik2 = Kubik2(6)
        val kubikRoll2 = kubik2.roll()

        // Обновите экран с помощью броска кубиков
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = kubikRoll.toString()
        val resultTextViews: TextView = findViewById(R.id.textView2)
        resultTextViews.text = kubikRoll2.toString()
    }
}

class Kubik(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

class Kubik2(val numSidess: Int) {
    fun roll():Int{
        return (1..numSidess).random()
    }
}