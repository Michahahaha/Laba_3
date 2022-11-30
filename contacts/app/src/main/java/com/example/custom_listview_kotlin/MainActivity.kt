package com.example.custom_listview_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.custom_listview_kotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d

        )

        val name = arrayOf(

            "Саша",  "Даша",  "Денис",  "Коля"
        )

        val surname = arrayOf(

            "Пушкарь","Ковтун","Серчюк","Барановский"

        )

        val email = arrayOf(

            "sacha@gmail.com","pop_zwezda@gmail.com","trans@gmail.com","volk@gmail.com"


        )

        val number = arrayOf(

            "7656610000","9999043232","7834354323","9876543211"

        )

        val country = arrayOf(
            "США","Україна","Єгипет","Варшава"

        )

        userArrayList = ArrayList()

        for( i in name.indices){

            val user = User(name[i],surname[i],email[i],number[i],country[i],imageId[i])
            userArrayList.add(user)

        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val surname = surname[position]
            val email = email[position]
            val number = number[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("surname",surname)
            i.putExtra("email",email)
            i.putExtra("number",number)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)


        }

    }
}