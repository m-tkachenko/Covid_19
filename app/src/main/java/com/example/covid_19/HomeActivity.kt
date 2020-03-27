package com.example.covid_19

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.Sensor.TYPE_STEP_COUNTER
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lateinit var langBtn : Button

        val settingsButton = findViewById<Button>(R.id.language_button)

        settingsButton.setOnClickListener{

            startActivity(Intent(this@HomeActivity, SettingsActivity::class.java))
        }

        val mapButton = findViewById<Button>(R.id.map_button)

        mapButton.setOnClickListener {

            startActivity(Intent(this@HomeActivity, MapActivity::class.java))
        }

        langBtn.findViewById<Button>(R.id.language_button)

        langBtn.setOnClickListener {

            showChangeLang()
        }

    }

    private fun showChangeLang() {

        val listLang = arrayOf("English", "Русский", "Українскій", "Deutcsh")

        val mBuilder = AlertDialog.Builder(this@HomeActivity)
        mBuilder.setTitle("Choose Language")
        mBuilder.setSingleChoiceItems(listLang,-1) { dialog, which ->

            if (which == 0) {
                setLocate("uk-rUA")
                recreate()
            }
        }
    }
}
