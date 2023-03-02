package uz.itschool.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.itschool.myapplication.R
import uz.itschool.myapplication.SportItems

class Adapter(var sports:MutableList<SportItems>) : RecyclerView.Adapter<Adapter.SportHolder>() {

    class SportHolder(itemView: View) : ViewHolder(itemView){
        var name: TextView = itemView.findViewById(R.id.name)
        var news_titles: TextView = itemView.findViewById(R.id.news_title)
        var news_tv: TextView = itemView.findViewById(R.id.news_tv)
        var img: ImageView = itemView.findViewById(R.id.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportHolder {
        var holder = SportHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sport, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: SportHolder, position: Int) {
        val itemsViewModel = sports[position]

        holder.img.setImageResource(itemsViewModel.img)
        holder.name.text = itemsViewModel.tv1
        holder.news_titles.text = itemsViewModel.tv2
        holder.news_tv.text = itemsViewModel.tv3
    }

    override fun getItemCount(): Int {
        return sports.size
    }
}