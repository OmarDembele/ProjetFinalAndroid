package com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model

import androidx.room.PrimaryKey

data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
    val name: String,
    val price: Long,
    val quantity: String,
    val StringSeuil: String,
)