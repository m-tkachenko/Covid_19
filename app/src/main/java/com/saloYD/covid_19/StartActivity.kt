package com.saloYD.covid_19

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class StartActivity : Fragment() {

    lateinit var detectButton : Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_start, container, false)

        detectButton = v.findViewById(R.id.detect_button_id)

        detectButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_startFragment_to_collectInfo2)
        )

        return v
    }

}
