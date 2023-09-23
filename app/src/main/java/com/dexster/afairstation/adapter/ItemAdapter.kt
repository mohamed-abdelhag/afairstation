package com.dexster.afairstation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dexster.afairstation.R
import com.dexster.afairstation.model.Affirmation

// Create an adapter class that extends RecyclerView.Adapter and takes a context and dataset.
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Create a ViewHolder class for the items in the RecyclerView.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // Define the TextView to display item titles.
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    // Override onCreateViewHolder to inflate the layout for each item in the RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // Override getItemCount to return the size of the dataset.
    override fun getItemCount() = dataset.size

    // Override onBindViewHolder to bind data to the ViewHolder.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Get the item at the current position in the dataset.
        val item = dataset[position]

        // Set the text of the TextView to the string resource specified in the item.
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
}
