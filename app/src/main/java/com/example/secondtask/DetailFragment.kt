package com.example.secondtask

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class DetailFragment : Fragment(R.layout.fragment_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = view.findViewById<ImageView>(R.id.image)
        val title = view.findViewById<TextView>(R.id.title)
        val description = view.findViewById<TextView>(R.id.description)

        val item = arguments?.getParcelable<ItemModel>("item")
        if (item != null) {
            title.text = item.title
            description.text = item.description
            Glide.with(this).load(item.getCurrentImageUrl()).into(image)
        }
    }
}