package com.example.surveyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_resultado.*
import java.util.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        showVotos()
        progressBar()

    }

    private fun showVotos(){
        val random = Random()
        val votos = random.nextInt(100000000) + 1;
        val message = getString(R.string.text_votos, votos.toString())
        textVotos.text = message
    }

    private fun progressBar(){
        val random = Random()
        val percent1 = random.nextInt(101) + 1;
        val percent2 = random.nextInt((101-percent1)) + 1;
        val dif = 100 - (percent1 + percent2)
        pbOption1.progress = percent1
        pbOption2.progress = percent2
        pbOption3.progress = dif
    }
}
