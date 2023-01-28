package com.example.offeron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class signup_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)

        val sign_btn_page = findViewById<Button>(R.id.signup_button)
        sign_btn_page.setOnClickListener {
            val otp_page = Intent(this, otp_activity::class.java)
            startActivity(otp_page)
        }

        val login_page1 = findViewById<Button>(R.id.login_signpage)
        login_page1.setOnClickListener {
            val loginn = Intent(this, login_activity::class.java)
            startActivity(loginn)
        }

        val back_arrow_sign = findViewById<ImageView>(R.id.back_button_signup)
        back_arrow_sign.setOnClickListener {
            val bk_img_btn = Intent(this, login_activity::class.java)
            startActivity(bk_img_btn)
        }

    }
}