package com.example.listbuah

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BuahAdapter(val namaBuah : Array<String>, val imgBuah : Array<Int> ) : RecyclerView.Adapter<BuahAdapter.MyViewHolder> () {
    class MyViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        val tvBuah = view.findViewById<TextureView>(R.id.txt_alpukat)
        val imgBuah = view.findViewById<ImageView>(R.id.img_alpukat)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buah,parent,true)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder,  position: Int) {
        holder.tvBuah.text = namaBuah[position]
        holder.imgBuah.setImageResource(imgBuah[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${namaBuah[position]}", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
       return namaBuah.size
    }
}