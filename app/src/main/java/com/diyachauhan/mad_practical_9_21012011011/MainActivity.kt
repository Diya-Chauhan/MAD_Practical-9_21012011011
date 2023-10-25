package com.diyachauhan.mad_practical_9_21012011011

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation: AnimationDrawable
    lateinit var heartmanimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image1)
        image1.setBackgroundResource(R.drawable.alaram_animation_list)
        alarmanimation= image1.background as AnimationDrawable

        val image2 = findViewById<ImageView>(R.id.image2)
        image2.setBackgroundResource(R.drawable.heart_animation_list)
        heartmanimation= image2.background as AnimationDrawable
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){

            alarmanimation.start()
            heartmanimation.start()
        }
        else{
            alarmanimation.stop()
            heartmanimation.stop()
        }
    }

}
