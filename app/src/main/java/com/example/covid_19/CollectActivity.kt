package com.example.covid_19

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_collect_info.*
import org.w3c.dom.Text
import java.util.*

@Suppress("UNREACHABLE_CODE")
class CollectActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")

    private var root: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_info)

        val submitButton = findViewById<Button>(R.id.submit_button)
        val statusButtonNegative = findViewById<Button>(R.id.radio_but_seven)
        val statusButtonPositive = findViewById<Button>(R.id.radio_but_six)
        var isSick = false



        submitButton.setOnClickListener {

            var homeActivity = Intent(this@CollectActivity, HomeActivity::class.java)
            homeActivity.putExtra("isSick", isSick)
            startActivity(homeActivity)

        }

        statusButtonNegative.setOnClickListener{

            submitButton.visibility = View.VISIBLE
            isSick = false

        }

        statusButtonPositive.setOnClickListener {

            submitButton.visibility = View.VISIBLE
            isSick = true

        }
    }
}


