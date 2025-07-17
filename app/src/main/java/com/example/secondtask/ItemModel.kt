package com.example.secondtask

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemModel(
    val title : String,
    val description : String,
    val imageUrls : List<String>,
    var currentImage : Int = 0
) : Parcelable {

    fun changeImage() {
        if (imageUrls.size <= 1) return
        currentImage = (0..<imageUrls.size).random()
    }

    fun getCurrentImageUrl(): String = imageUrls[currentImage]
}