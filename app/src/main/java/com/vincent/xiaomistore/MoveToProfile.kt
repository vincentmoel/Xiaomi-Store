package com.vincent.xiaomistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MoveToProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_person)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imageProfile : ImageView = findViewById(R.id.img_profile)
        var imageResource : Int = resources.getIdentifier("@drawable/profile",null, this.packageName)
        imageProfile.setImageResource(imageResource)
    }
}