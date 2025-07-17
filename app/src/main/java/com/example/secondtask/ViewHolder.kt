package com.example.secondtask

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class ViewHolder(
    itemView: View,
    private val requestManager: RequestManager,
    private val onItemClick: (Int) -> Unit,
    private val onImageClick: (Int) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val title = itemView.findViewById<TextView>(R.id.titleText)
    private val description = itemView.findViewById<TextView>(R.id.descriptionText)
    private val number = itemView.findViewById<TextView>(R.id.number)
    private val image = itemView.findViewById<ImageView>(R.id.image)
    private val divider = itemView.findViewById<View>(R.id.divider)

    fun bindData(item: ItemModel, position: Int, amount: Int) {
        title.text = item.title
        description.text = item.description
        number.text = (position+1).toString()
        divider.isVisible = position != amount - 1
        requestManager.load(item.getCurrentImageUrl()).into(image)

        itemView.setOnClickListener {
            onItemClick(adapterPosition)
        }
        image.setOnClickListener {
            onImageClick(adapterPosition)
        }
    }

    fun bindImage(item: ItemModel) {
        requestManager.load(item.getCurrentImageUrl()).into(image)
    }
}