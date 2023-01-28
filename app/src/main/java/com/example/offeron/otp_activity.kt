package com.example.offeron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class otp_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity)


        val submit_otp = findViewById<Button>(R.id.submit_otp_button)
       submit_otp.setOnClickListener {
            val otp = Intent(this, login_activity::class.java)
            startActivity(otp)

        }

        val back_arrow_otp = findViewById<ImageView>(R.id.back_button_otp)
        back_arrow_otp.setOnClickListener {
            val bk_img_otp = Intent(this, signup_activity::class.java)
            startActivity(bk_img_otp)
        }
    }
}