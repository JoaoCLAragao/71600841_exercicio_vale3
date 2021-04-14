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
                "Alison Sweet"
            )
        )

        api_rent.add(
            Rent(
                1655,
                1,
                "Pushkinskaya subway",
                "58 min",
                R.drawable.tobias_tweet_image,
                R.drawable.tobias_profile_pic,
                "Tobias",
                "van Schneider"
            )
        )

        api_rent.add(
            Rent(
                1450,
                0,
                "Petrogradskaya subway",
                "40 min",
                R.drawable.bitmap_living_room,
                R.drawable.azizfirat_profile_pic,
                "Aziz",
                "Firat"
            )
        )

        api_rent.add(
            Rent(
                2000,
                1,
                "Av. Santa Cruz 321",
                "50 Min",
                R.drawable.bitmap_door,
                R.drawable.jonatan_profile_pic,
                "Jonatan",
                "Castro"
            )
        )

        list_rent.adapter = rentAdapter(this, api_rent)

    }
}