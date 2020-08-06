package com.benr.takeawaydecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val places = mutableListOf<String>("Atari-Ya", "Iro Sushi")

        button_decide.setOnClickListener {
            val randomPlace = places.random()
            selection.text = randomPlace
        }

        button_add.setOnClickListener {
            places.add(text_add.text.toString())
            text_add.text.clear()
        }

    }
}