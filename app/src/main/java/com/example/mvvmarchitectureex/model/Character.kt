package com.example.mvvmarchitectureex.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    val name: String,
    val species: String,
    val gender: String,
    val house: String,
    val dateOfBirth: String,
    val yearOfBirth: String,
    val ancestry: String,
    val patronus: String,
    val actor: String,
    val alive: String,
    val image: String
) : Parcelable