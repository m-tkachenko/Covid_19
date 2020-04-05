package com.saloYD.covid_19

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class HomeActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        MobileAds.initialize(this)
        var mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)


        val mapButton = findViewById<Button>(R.id.map_button)

        val textStatus : TextView = findViewById(R.id.status_text_view)
        val textIstructionsStart : TextView = findViewById(R.id.instructions_start)
        val textIstructionsFirst : TextView = findViewById(R.id.instructions_first)
        val textInstructionsSecond : TextView = findViewById(R.id.instructions_second)
        val textInstructionsThird : TextView = findViewById(R.id.instructions_third)
        val textInstructionsFourth : TextView = findViewById(R.id.instructions_fourth)
        val textInstructionsFive : TextView = findViewById(R.id.instructions_five)
        val textInstructionsEnd : TextView = findViewById(R.id.instructions_end)


        val intent = intent
        val isSick = intent.getBooleanExtra("isSick", false)
        mapButton.setOnClickListener {

            startActivity(Intent(this@HomeActivity, MapActivity::class.java))
        }

        if (isSick) {

            textStatus.text = getString(R.string.status_positive)
            textStatus.setBackgroundResource(R.drawable.status_positive_backgrround_style)

            textIstructionsStart.text = getString(R.string.instruction_start_ill)
            textIstructionsFirst.text = getString(R.string.instruction_first_ill)
            textInstructionsSecond.text = getString(R.string.instruction_second_ill)
            textInstructionsThird.text = getString(R.string.instruction_third_ill)
            textInstructionsFourth.text = getString(R.string.instruction_fouth_ill)
            textInstructionsFive.text = getString(R.string.instruction_five_ill)
            textInstructionsEnd.text = getString(R.string.instruction_end_ill)

        } else {


        }
    }
}
