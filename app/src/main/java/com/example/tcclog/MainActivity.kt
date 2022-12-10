package com.example.tcclog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val buttonP = findViewById<Button>(R.id.bpass)
        val buttonD = findViewById<Button>(R.id.devices)
        val buttonF = findViewById<Button>(R.id.bfpass)
        val buttonR = findViewById<Button>(R.id.registers)
        val buttonE = findViewById<Button>(R.id.button6)

        buttonP.setOnClickListener {
            val intent = Intent(this@MainActivity, Passl::class.java)
            startActivity(intent)
        }

        buttonD.setOnClickListener{
            val intent = Intent(this@MainActivity, devices::class.java)
            startActivity(intent)
        }

        buttonF.setOnClickListener{
            val intent = Intent(this@MainActivity, Fpass::class.java)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }

        buttonE.setOnClickListener{
            val intent = Intent(this@MainActivity, Pcard::class.java)
            startActivity(intent)
        }
    }
}

