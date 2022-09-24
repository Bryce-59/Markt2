package com.example.markt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.markt.databinding.ActivityItemDetailBinding

class ItemDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItemDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        fillItemDetails()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun fillItemDetails() {
        val itemName: TextView = findViewById(R.id.item_text)
        val itemDescription: TextView = findViewById(R.id.item_description)

        itemName.text = intent.extras?.getString("name")
        itemDescription.text = intent.extras?.getString("description")
    }
}