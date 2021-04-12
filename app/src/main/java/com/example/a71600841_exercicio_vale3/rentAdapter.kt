package com.example.a71600841_exercicio_vale3

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_list_rent.view.*
import org.w3c.dom.Text

class rentAdapter (var context: Context, var list_rent: List<Rent>) : BaseAdapter() {
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_list_rent, null)

        var value_rent = view.findViewById<TextView>(R.id.value_rent)
        value_rent.text = list_rent[position].value_rent.toString()

        var star_favorite = view.findViewById<ImageView>(R.id.star_favorite)
        if (list_rent[position].star == 0){
            star_favorite.setImageDrawable(context.getDrawable(R.drawable.star_empty))
        }else{
            star_favorite.setImageDrawable((context.getDrawable(R.drawable.star_full)))
        }

        var adress = view.findViewById<TextView>(R.id.adress)
        adress.text = list_rent[position].adress

        var time = view.findViewById<TextView>(R.id.time)
        time.text = list_rent[position].time

        var photo_house = view.findViewById<ImageView>(R.id.photo_house)
        if (list_rent[position].photo_house == 0){
            photo_house.visibility = ImageView.GONE
        }else {
            photo_house.setImageDrawable(context.getDrawable(list_rent[position].photo_house))
        }

        var photo_owner = view.findViewById<ImageView>(R.id.photo_owner)
        if (list_rent[position].photo_owner == 0){
            photo_owner.visibility = ImageView.GONE
        }else{
            photo_owner.setImageDrawable(context.getDrawable(list_rent[position].photo_owner))
        }

        var name_owner = view.findViewById<TextView>(R.id.name_owner)
        name_owner.text = list_rent[position].name_owner

        var surname_owner = view.findViewById<TextView>(R.id.surname_owner)
        surname_owner.text = list_rent[position].surname





        return view
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list_rent.size
    }
}