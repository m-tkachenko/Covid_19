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

        progress_finger_bar()
        progress_oxygen_bar()
        progress_breath_bar()

    }

    fun progress_finger_bar(){

        var count = 0
        val timer = Timer()

        timer.schedule(object : TimerTask(){
            override fun run() {

                count++
                progress_bar_finger.progress = count

                if(count > 100) {

                    timer.cancel()
                    finish()
                }
            }
        }, 0, 25)
    }

    fun progress_oxygen_bar(){

        var count = 0
        val timer = Timer()

        timer.schedule(object : TimerTask(){
            override fun run() {

                count++
                progress_bar_oxygen.progress = count

                if(count > 100) {

                    timer.cancel()
                    finish()
                }
            }
        }, 0, 25)
    }

    fun progress_breath_bar(){

        val intent = Intent(this@CollectActivity, HomeActivity::class.java)
        var count = 0
        val timer = Timer()

        timer.schedule(object : TimerTask(){
            override fun run() {

                count++
                progress_bar_breath.progress = count

                if(count > 100) {

                    timer.cancel()
                    startActivity(intent)
                    finish()
                }
            }
        }, 0, 25)
    }
}


