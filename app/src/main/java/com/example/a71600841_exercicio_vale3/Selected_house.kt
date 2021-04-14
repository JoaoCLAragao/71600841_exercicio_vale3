package com.example.a71600841_exercicio_vale3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_selected_house.*

class Selected_house : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_house)

        btn_back.setOnClickListener {
            backMainActivity()
        }

        var list_rent = intent.getSerializableExtra("lista") as Rent
        var calc_monthly_fee = list_rent.value_rent * 0.1

        if (list_rent.star == 0){
            star_favorite.setImageDrawable(getDrawable(R.drawable.star_empty))
        }else{
            star_favorite.setImageDrawable(getDrawable(R.drawable.star_full))
        }

        image_focus.setImageDrawable(getDrawable(list_rent.photo_house))
        photo_owner.setImageDrawable(getDrawable(list_rent.photo_owner))
        name_owner.text = list_rent.name_owner
        monthly_fee_text.text = list_rent.value_rent.toString()
        utility_bills_text.text = calc_monthly_fee.toString()
        security_deposit_text.text = list_rent.value_rent.toString()
        adress_simple.text = list_rent.adress
        adress_full.text = list_rent.adress

    }

    fun backMainActivity(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}