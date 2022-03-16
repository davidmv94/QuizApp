package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityScoreBinding

private lateinit var binding : ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val points = bundle?.getInt("points")

        binding.tvScore.text = points.toString()
    }
}