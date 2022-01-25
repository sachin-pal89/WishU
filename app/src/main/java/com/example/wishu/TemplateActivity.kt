package com.example.wishu

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.wishu.R.drawable
import kotlinx.android.synthetic.main.activity_template.*

class TemplateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template)
        WindowCompat.setDecorFitsSystemWindows(window,false)
    }

    fun chooseTemplate(view: View) {

        val nameCard = intent.getStringExtra(GreetingCardActivity.NAME_EXTRA)

        val intentImg = Intent(this, GreetingCardActivity::class.java)

        intentImg.putExtra(GreetingCardActivity.NAME_EXTRA,nameCard)

        when (view.id) {
            R.id.greet1 -> intentImg.putExtra(GreetingCardActivity.IMG_EXTRA,drawable.birthdaygreet)
            R.id.greet2 -> intentImg.putExtra(GreetingCardActivity.IMG_EXTRA,drawable.birthdaygreet2)
            else -> intentImg.putExtra(GreetingCardActivity.IMG_EXTRA,drawable.birthdaygreet3)
        }

        Toast.makeText(this,"Greeting Card for $nameCard", Toast.LENGTH_LONG).show()

        startActivity(intentImg)
    }
}

