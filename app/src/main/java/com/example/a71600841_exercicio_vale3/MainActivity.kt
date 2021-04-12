package com.example.a71600841_exercicio_vale3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var api_rent = ArrayList<Rent>()

        api_rent.add(
            Rent(
                1450,
                0,
                "Bedroom , Petrogradskaya subway",
                "32 min",
                R.drawable.bitmap_stairs,
                R.drawable.photo_mari_ann,
                "Mari Ann",
                "Alison Sweet (mutual)"
            )
        )

        api_rent.add(
            Rent(
                1655,
                1,
                "Bedroom , Pushkinskaya subway",
                "58 min",
                R.drawable.bitmap_door,
                0,
                "",
                ""
            )
        )

        api_rent.add(
            Rent(
                1450,
                0,
                "Bedroom , Petrogradskaya subway",
                "32 min",
                R.drawable.bitmap_stairs,
                R.drawable.photo_mari_ann,
                "Mari Ann",
                "Alison Sweet (mutual)"
            )
        )

        list_rent.adapter = rentAdapter(this, api_rent)

    }
}