package com.example.android1homework4group16

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var tvText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvText = this.findViewById(R.id.tv_text)
        acceptText()
    }

    private fun acceptText() {
        val text = intent.getStringExtra(MainActivity.TEXT_KEY)
        if (text != null) {
            tvText.text = text
        }
    }
}