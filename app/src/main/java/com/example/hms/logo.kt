package com.example.hms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class logo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo)

        Handler().postDelayed({
            startActivity(Intent(this,splashscreen::class.java))
            finish()
        },2500)
    }
}