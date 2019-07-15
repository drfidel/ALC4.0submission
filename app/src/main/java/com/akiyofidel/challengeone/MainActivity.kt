package com.akiyofidel.challengeone

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to button
        val btn_profile = findViewById(R.id.profile_button) as Button
        val btn_about = findViewById(R.id.about_button) as Button

        //set on click listener for the profile button
        btn_profile.setOnClickListener {
            //add code to perform click task
            val profileintent = Intent(this,Profile::class.java)
            startActivity(profileintent)
        }

        //set onclick listener for the about button
        btn_about.setOnClickListener {
            val aboutintent = Intent(this, AboutActivity::class.java)
            startActivity(aboutintent)
        }


    }

}


