package com.example.android1homework4group16

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var tvText: TextView
    private lateinit var ivGallery: ImageView

    private val counter = registerForActivityResult(ActivityResultContracts.GetContent()) {
        ivGallery.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ivGallery = this.findViewById(R.id.iv_gallery)
        tvText = this.findViewById(R.id.tv_text)

        acceptText()
        chooseImageFromGallery()
    }

    private fun chooseImageFromGallery() {
        ivGallery.setOnClickListener {
            counter.launch("image/*")
        }
    }

    private fun acceptText() {
        val text = intent.getStringExtra(MainActivity.TEXT_KEY)
        if (text != null) {
            tvText.text = text
        }
    }
}