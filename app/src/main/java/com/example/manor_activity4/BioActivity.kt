package com.example.manor_activity4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        val bioTextView = findViewById<TextView>(R.id.tvBio)

        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val school = intent.getStringExtra("school")
        val year = intent.getStringExtra("year")
        val degree = intent.getStringExtra("degree")
        val major = intent.getStringExtra("major")
        val activities = intent.getStringExtra("activities")

        val bioText = "$firstName $lastName holds a $degree in $major from $school and graduated in $year. " +
                "Their favorite activities include $activities."

        bioTextView.text = bioText
    }
}