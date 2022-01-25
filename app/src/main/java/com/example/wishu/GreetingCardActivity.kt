package com.example.wishu

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.wishu.R.*
import com.example.wishu.R.raw.*
import kotlinx.android.synthetic.main.activity_greeting_card.*

class GreetingCardActivity : AppCompatActivity() {

    companion object
    {
        const val NAME_EXTRA = "name_extra"
        const val IMG_EXTRA = "img_extra"
        lateinit var mediaPlayer: MediaPlayer
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_greeting_card)
        WindowCompat.setDecorFitsSystemWindows(window,false)

        val name = intent.getStringExtra(NAME_EXTRA)
        val image = intent.getIntExtra(IMG_EXTRA,1)

        greetingCard.setImageResource(image)
        greeting.text = "Happy Birthday\n $name"

        // For Audio Playing
        mediaPlayer = MediaPlayer.create(this, birthday_song)
        mediaPlayer.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.release()
    }
}
