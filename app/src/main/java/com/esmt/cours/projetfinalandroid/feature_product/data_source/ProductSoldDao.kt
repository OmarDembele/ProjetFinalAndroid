package com.esmt.cours.projetandroidjetpackcompose.feature_product.data.data_source

import androidx.room.*
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.Product
import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.ProductSold
import kotlinx.coroutines.flow.Flow


@Dao
interface ProductSoldDao {
    @Insert
    suspend fun insert(productSold: ProductSold): Long

    @Delete
    suspend fun delete(product: ProductSold)

    @Query("SELECT * FROM productSold ")
    fun getProductSold(): Flow<List<ProductSold>>

    @Query("SELECT * FROM productSold WHERE id = :id")
    suspend fun getProductSoldById(id: Int): ProductSold?
}