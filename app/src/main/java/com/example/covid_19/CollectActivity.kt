package com.example.covid_19

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_collect_info.*
import java.util.*

@Suppress("UNREACHABLE_CODE")
class CollectActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_info)

        startActivity(Intent(this@CollectActivity, HomeActivity::class.java))

    }
}


