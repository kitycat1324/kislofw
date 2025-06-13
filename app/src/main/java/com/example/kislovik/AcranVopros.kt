package com.example.kislovik

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Chronometer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class AcranVopros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_acran_vopros)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val chronometer = findViewById<View?>(R.id.timer) as Chronometer
        val startTime = SystemClock.elapsedRealtime()
        chronometer.setBase(startTime)

        val s: CheckBox= findViewById(R.id.checkBox)
        s.setOnClickListener {
            val intent= Intent(this, result1::class.java)
            startActivity(intent)
        }
        val s6: CheckBox = findViewById(R.id.checkBox2)
        s6.setOnClickListener {
            val intent= Intent(this, result2::class.java)
            startActivity(intent)
        }





    }
}