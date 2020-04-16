package com.osacky.merging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(com.osacky.one.R.id.button_one).setOnClickListener { Toast.makeText(this, "one", Toast.LENGTH_SHORT).show() }
        findViewById<Button>(com.osacky.one.R.id.button_two).setOnClickListener { Toast.makeText(this, "two", Toast.LENGTH_SHORT).show() }
    }
}