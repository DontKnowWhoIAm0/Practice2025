package com.example.secondtask

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListFragment : Fragment(R.layout.fragment_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.list)
        val dataList = Models.getGeneratedList()
        val adapter = Adapter(
            dataList = dataList,
            requestManager = Glide.with(this),
            onItemClick = { position ->
                val item = dataList[position]
                val bundle = Bundle().apply {
                    putParcelable("item", item)
                }
                findNavController().navigate(R.id.action_listFragment_to_detailFragment, bundle)
            },
            onImageClick = {position ->
                val item = dataList[position]
                item.changeImage()
                val viewHolder = recyclerView.findViewHolderForAdapterPosition(position) as? ViewHolder
                viewHolder?.bindImage(item)
            }
        )
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}