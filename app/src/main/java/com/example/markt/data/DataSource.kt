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
            Item(R.drawable.o_cat, "cat", "cute cat", roger),
            Item(R.drawable.o_dog, "dog", "cute dog", roger),
            Item(R.drawable.o_desk, "A desk", "Very good desk. Light use.", kendra),
            Item(R.drawable.o_laptop, "A personal computer", "It might be haunted.", kendra),
            Item(R.drawable.o_bug, "cool bug", "very cool bug. I found it off of Guadalupe and 24th St last weekend at 4:23pm, it was probably one of the most incredible moments of my life. It honestly turned my life around and helped me get As on all of my midterms. But after some deep reflection, I've realized that I'm not really qualified to be the father of a bug, it's a lot of responsibility, so I'm hoping he can find a home with one of you. Please take care of roger jr, from roger", roger),
            Item(R.drawable.o_dvd, "Harry Potter DVD Boxset", "I don't want it anymore.", kendra),
            Item(R.drawable.o_blender, "Industry-grade Blender", "Do you want to ask questions, or do you want to blend.", kendra),
            Item(R.drawable.o_cola, "Bottled Air", "Only used once.", kendra),
        )
    }
}