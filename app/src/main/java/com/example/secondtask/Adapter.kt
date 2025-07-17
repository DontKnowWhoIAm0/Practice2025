package com.example.secondtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class Adapter (
    private val dataList: List<ItemModel>,
    private val requestManager: RequestManager,
    private val onItemClick: (Int) -> Unit,
    private val onImageClick: (Int) -> Unit,
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_item, parent, false)
        return ViewHolder(
            itemView = view,
            requestManager = requestManager,
            onItemClick = onItemClick,
            onImageClick = onImageClick,
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(item = dataList[position], position = position, amount = dataList.size)
    }

    override fun getItemCount(): Int = dataList.size
}