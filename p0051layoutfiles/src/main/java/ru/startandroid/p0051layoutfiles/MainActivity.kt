package ru.startandroid.p0051layoutfiles
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // вызов родительского класса
        enableEdgeToEdge()
        setContentView(R.layout.myscreen)  // Метод setContentView(int) – устанавливает содержимое Activity из layout-файла
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.myscreenmain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}