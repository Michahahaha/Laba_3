package com.example.custom_listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.custom_listview_kotlin.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val email = intent.getStringExtra("email")
        val number = intent.getStringExtra("number")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.a)
        
        binding.nameProfile.text = name
        binding.surnameProfile.text = surname
        binding.emailProfile.text = email
        binding.phoneProfile.text = number
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)


    }
}