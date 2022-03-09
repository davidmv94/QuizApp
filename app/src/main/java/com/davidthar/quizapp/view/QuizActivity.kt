package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityQuizBinding
import com.davidthar.quizapp.databinding.ActivityRankingBinding

private lateinit var binding : ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnBack.setOnClickListener {
            this.onBackPressed()
        }
    }
}