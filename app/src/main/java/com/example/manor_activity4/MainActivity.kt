package com.example.manor_activity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {
        val firstNameInput = findViewById<EditText>(R.id.etFirstName)
        val lastNameInput = findViewById<EditText>(R.id.etLastName)
        val schoolInput = findViewById<EditText>(R.id.etSchool)
        val yearInput = findViewById<EditText>(R.id.etYear)
        val degreeInput = findViewById<EditText>(R.id.etDegree)
        val majorInput = findViewById<EditText>(R.id.etMajor)
        val activitiesInput = findViewById<EditText>(R.id.etActivities)

        val firstName = firstNameInput.text.toString()
        val lastName = lastNameInput.text.toString()
        val school = schoolInput.text.toString()
        val year = yearInput.text.toString()
        val degree = degreeInput.text.toString()
        val major = majorInput.text.toString()
        val activities = activitiesInput.text.toString()

        Intent(this,BioActivity::class.java).also {
            it.putExtra("firstName", firstName)
            it.putExtra("lastName", lastName)
            it.putExtra("school", school)
            it.putExtra("year", year)
            it.putExtra("degree", degree)
            it.putExtra("major", major)
            it.putExtra("activities", activities)
            startActivity(it)
        }
    }
}