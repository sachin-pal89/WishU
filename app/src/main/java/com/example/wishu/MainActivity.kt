package com.example.wishu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.WindowCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window,false)
    }

    fun createCard(view: View) {

        val name = nameOnCard.editableText.toString()

        val intentCard = Intent(this, TemplateActivity::class.java)
        intentCard.putExtra(GreetingCardActivity.NAME_EXTRA,name)
        startActivity(intentCard)
    }
}