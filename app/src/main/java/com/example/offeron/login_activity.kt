package com.example.offeron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class  login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


        val loginbtn = findViewById<Button>(R.id.login_button)
        loginbtn.setOnClickListener {
            val log = Intent(this, MainActivity::class.java)
            startActivity(log)
        }

        val signup_btn = findViewById<Button>(R.id.signup_click_btn)
        signup_btn.setOnClickListener {
            val sign = Intent(this,signup_activity::class.java)
            startActivity(sign)
        }
    }
}