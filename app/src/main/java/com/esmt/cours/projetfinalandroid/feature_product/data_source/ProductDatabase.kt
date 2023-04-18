package com.esmt.cours.projetandroidjetpackcompose.feature_product.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.Product
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.User


@Database(entities = [Product::class], version = 1)
abstract class ProductDatabase : RoomDatabase(){
    abstract  val productDao: ProductDao
}