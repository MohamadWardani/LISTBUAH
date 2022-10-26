package com.example.listbuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var namaBuah = arrayOf("alpukat", "buahnaga", "ceri", "jambu", "kelapa", "pisang", "semangka")
        var imgBuah = arrayOf(
            R.drawable.alpukat,
            R.drawable.buahnaga,
            R.drawable.ceri,
            R.drawable.jambu,
            R.drawable.kelapa,
            R.drawable.pisang,
            R.drawable.semangka,
        )

        val buahAdapter = BuahAdapter(namaBuah, imgBuah)

        rv_buah.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = buahAdapter
        }
    }
}