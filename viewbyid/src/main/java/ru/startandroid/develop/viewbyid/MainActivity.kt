package ru.startandroid.develop.viewbyid

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val myText = findViewById<TextView>(R.id.myText)    // Получаем TextView
        val myBtn = findViewById<Button>(R.id.myBtn)        // Получаем Button
        val myChb = findViewById<CheckBox>(R.id.myChb)      // Получаем CheckBox

        myText.text = "New text in TextView"    // Устанавливаем текст
        myBtn.text = "New button"               // Устанавливаем текст
        myBtn.isEnabled = false                 // Делаем кнопку недоступной
        myChb.isChecked = true                  // При запуске флажок установлен
    }
}