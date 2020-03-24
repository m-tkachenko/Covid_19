package com.example.covid_19

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
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity(), SensorEventListener {

    private var running = false
    private var sensorManager:SensorManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager


        val settingsButton = findViewById<Button>(R.id.settings_button)

        settingsButton.setOnClickListener{

            startActivity(Intent(this@HomeActivity, SettingsActivity::class.java))
        }

        val mapButton = findViewById<Button>(R.id.map_button)

        mapButton.setOnClickListener {

            startActivity(Intent(this@HomeActivity, MapActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()


        val pm = packageManager
        if (pm.hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {

            Toast.makeText(this, "WORK!!!!!!!!!!!", Toast.LENGTH_SHORT).show()
        }

        running = true

        val stepsSensor = sensorManager?.getDefaultSensor(TYPE_STEP_COUNTER)

        if (stepsSensor == null) {

            Toast.makeText(this, "No Step Counter Sensor", Toast.LENGTH_SHORT).show()
        }
        else {

            sensorManager?.registerListener(this, stepsSensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onPause() {
        super.onPause()

        running = false

        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }


    override fun onSensorChanged(event: SensorEvent?) {

        Toast.makeText(this, "WORK!!!!!!!!!!!", Toast.LENGTH_SHORT).show()


        if(running == true) {

                stepsCounter.text = "" + event!!.values[0]
        }
    }
}
