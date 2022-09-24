package com.example.markt.model

import androidx.annotation.DrawableRes
import java.util.Date

data class Item (
    @DrawableRes val imageResourceId: Int?,
    val name: String,
    val description: String?,
    val lister: User
)