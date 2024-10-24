package ru.startandroid.develop.listener

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tvOut: TextView
    private lateinit var btnOk: Button
    private lateinit var btnCancel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Найдем View-элементы
        tvOut = findViewById(R.id.tvOut)
        btnOk = findViewById(R.id.btnOk)
        btnCancel = findViewById(R.id.btnCancel)

        // создаем обработчик нажатия
        val oclBtn: View.OnClickListener = View.OnClickListener { v ->
            when (v.id) {
                R.id.btnOk -> {
                    // Меняем текст в TextView (tvOut)
                    tvOut.text = "Нажата кнопка ОК"
                }
                R.id.btnCancel -> {
                    // Меняем текст в TextView (tvOut)
                    tvOut.text = "Нажата кнопка Cancel"
                }
            }
        }
        // присвоим обработчик кнопкам
        btnOk.setOnClickListener(oclBtn)
        btnCancel.setOnClickListener(oclBtn)
    }
}
