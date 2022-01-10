package com.hazard.samarpan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setTheme(R.style.Theme_Samarpan)
           This part of the code is used to set the default theme as the theme was set to the splash screen before setting the main activity layout
           remove the comment tag for adding the logic*/
        setContentView(R.layout.activity_main)
    }
}