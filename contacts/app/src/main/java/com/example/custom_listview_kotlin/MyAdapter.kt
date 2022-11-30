package com.example.custom_listview_kotlin

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity,private val arrayList : ArrayList<User>) : ArrayAdapter<User>(context,
                R.layout.list_item,arrayList)        {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.profile_pic)
        val name : TextView = view.findViewById(R.id.name_profile)
        val surname : TextView = view.findViewById(R.id.surname_profile)
        val number : TextView = view.findViewById(R.id.number_profile)


        imageView.setImageResource(arrayList[position].imageId)
        name.text = arrayList[position].name
        surname.text = arrayList[position].surname
        number.text = arrayList[position].number
        

        return view
    }

}