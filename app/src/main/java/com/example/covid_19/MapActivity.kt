package com.example.covid_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid_map)

        val homeButton = findViewById<Button>(R.id.exit_to_menu_button)

        homeButton.setOnClickListener {

            startActivity(Intent(this@MapActivity, HomeActivity::class.java))
        }
    }
}
