package com.rahulandroid.productdemo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Product(
    @PrimaryKey val id: Int,
    val title: String,
    val price: Float,
    val category: String,
    val description: String,
    val image: String,
//    var rating: ProductRating,
    // When adding to cart
    var addedToCart: Boolean = false,
    // When added as Favorites
    var addedAsFavorite: Boolean = false,
)

data class ProductRating(var rate: Float, var count: Int)