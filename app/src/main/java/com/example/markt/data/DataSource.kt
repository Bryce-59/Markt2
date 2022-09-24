package com.example.markt.data

import com.example.markt.R
import com.example.markt.model.Item
import com.example.markt.model.User

class DataSource {
    fun loadUsers(): List<User> {
        return listOf(
            User("Roger Dodger", "@_rogeroger", "Austin"),
            User("Kendra Space", "512-XXX-XX99", "Round Rock")
        )
    }

    fun loadItems(): List<Item> {
        val roger = User("Roger Dodger", "@_rogerogeroger", "Austin")
        val kendra = User("Kendra Chemist", "512-XXX-XX99", "Round Rock")
        return listOf(
            Item(R.drawable.icons8_online_shop_64, "A cat", "cute cat", roger),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", roger),
            Item(R.drawable.icons8_online_shop_64, "Another dog", "cute dog", kendra),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", kendra),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", roger),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", kendra),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", kendra),
            Item(R.drawable.icons8_online_shop_64, "A dog", "cute dog", kendra),
        )
    }
}