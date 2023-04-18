package com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User (
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val confirmPassword: String

    )