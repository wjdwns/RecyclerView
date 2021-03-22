package com.example.recyclerview

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.person.view.*

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun setItem(item:Person){
            itemView.textView3.text = item.name
            itemView.textView4.text =item.mobile
        }
    }
    val items = ArrayList<Person>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.person,parent,false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= items[position]
        holder.setItem(item)
    }

    override fun getItemCount() = items.size

}