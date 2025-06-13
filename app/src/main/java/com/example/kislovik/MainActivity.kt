package com.example.kislovik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val s: Button = findViewById(R.id.akz)
        s.setOnClickListener {
            val intent= Intent(this, AcranVopros::class.java)
            startActivity(intent)
        }
        val o: Button = findViewById(R.id.button2)
        o.setOnClickListener {
            val intent= Intent(this, Bilet::class.java)
            startActivity(intent)
        }
        val o7: Button = findViewById(R.id.button4)
        o7.setOnClickListener {
            val intent= Intent(this, Thems::class.java)
            startActivity(intent)
        }
        val tt: Button = findViewById(R.id.button18)
        tt.setOnClickListener {
            val intent= Intent(this, Reiting::class.java)
            startActivity(intent)
        }
    }
}