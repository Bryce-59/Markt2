package com.example.markt.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.markt.ItemDetailActivity
import com.example.markt.R
import com.example.markt.data.DataSource
import com.example.markt.model.Item

class ItemCardAdapter (
    private val context: Context,
    ) : RecyclerView.Adapter<ItemCardAdapter.ItemViewHolder>() {

    private val dataset: List<Item> = DataSource().loadItems()

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textView: TextView = view.findViewById(R.id.item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.grid_list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId!!)
        holder.textView.text = item.name
        holder.itemView.setOnClickListener {
            val itemIntent = Intent(holder.itemView.context, ItemDetailActivity::class.java)
            itemIntent.putExtra("name", item.name)
            itemIntent.putExtra("description", item.description)
            context.startActivity(itemIntent)
        }
    }

    override fun getItemCount(): Int = dataset.size
}