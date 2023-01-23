package com.example.diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ProgrammimgAdapter :ListAdapter <ProgrammimgItem, ProgrammimgAdapter.ProgrammimgViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammimgViewHolder {
      val view= LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ProgrammimgViewHolder(view)
    }


    override fun onBindViewHolder(holder: ProgrammimgViewHolder, position: Int) {
        val item=getItem(position)
        holder.bind(item)
    }


    class ProgrammimgViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val initial = view.findViewById<TextView>(R.id.initial)


        fun bind(item: ProgrammimgItem) {
            name.text = item.name
            initial.text = item.initial
        }
    }
    class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<ProgrammimgItem>()
    {
        override fun areItemsTheSame(oldItem: ProgrammimgItem, newItem: ProgrammimgItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ProgrammimgItem,
            newItem: ProgrammimgItem
        ): Boolean {
            return oldItem == newItem
        }

    }
}



