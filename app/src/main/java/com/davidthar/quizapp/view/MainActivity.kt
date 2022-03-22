package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.databinding.ActivityMainBinding
import com.davidthar.quizapp.model.extensions.changeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initButtons()
    }

    private fun initButtons() {
        binding.btnInformation.setOnClickListener {
            changeActivity(InfoActivity())
        }

        binding.btnRanking.setOnClickListener {
            changeActivity(RankingActivity())
        }

        binding.btnPlay.setOnClickListener {
            changeActivity(QuizActivity())
        }
    }

    //Deactivate back on this Activity
    override fun onBackPressed() {}
}