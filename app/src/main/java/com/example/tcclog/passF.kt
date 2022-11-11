package com.example.tcclog



import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout


class Fpass : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.senha_unica)

        val buttonS = findViewById<Button>(R.id.buttonC)

        buttonS.setOnClickListener {

            val mainLayout = findViewById<LinearLayout>(R.id.passF)

            val inflater = layoutInflater
            var choro = inflater.inflate(R.layout.card_register, mainLayout, false)
            var text = choro.findViewById<Button>(R.id.buttonC)
            mainLayout.addView(choro)
            text.setOnClickListener {
                mainLayout.removeView(choro)
            }

        }

    }
}