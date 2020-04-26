package com.deanthonee.shopapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String,
    val price: String,
    val brand: String,
    val category: String,
    val imageUrl: String
) : Parcelable