package com.esmt.cours.projetfinalandroid.feature_product.domain.data

import com.esmt.cours.projetandroidjetpackcompose.feature_product.domain.model.Product

data class ProductState(
    val products: List<Product> = emptyList(),
    val name: String= "",
    val price: Long =0,
    val quantity: Int = 0,
    val quantitySeuil: Int = 0,
    val isAddingProduct: Boolean = false,
)
