package com.esmt.cours.projetandroidjetpackcompose.feature_product.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.ProductSold


@Database(entities = [ProductSold::class], version = 1)
abstract class ProductSoldDatabase : RoomDatabase(){
    abstract  val productSoldDao: ProductSoldDao
}
