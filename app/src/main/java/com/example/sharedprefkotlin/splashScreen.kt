package com.example.sharedprefkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        val backgroundImg: ImageView = findViewById(R.id.iv_logo)
        backgroundImg.startAnimation(sideAnimation)

        Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
            finish()
        },2500)
    }
}