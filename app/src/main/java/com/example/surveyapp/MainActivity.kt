package com.example.surveyapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initProgressBar()

        btnVotar.setOnClickListener() {
            Toast.makeText(this, R.string.text_result, Toast.LENGTH_LONG).show()
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }
    }


}
