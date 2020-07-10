package com.benr.takeawaydecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val places = arrayOf("Amici Miei", "Atari-Ya", "Iro Sushi", "La Lluna, Eat Tokyo")

        val randomPlace = places.random()

        selection.text = randomPlace
    }
}