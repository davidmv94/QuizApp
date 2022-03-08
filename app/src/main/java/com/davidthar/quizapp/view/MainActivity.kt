package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityMainBinding
import com.davidthar.quizapp.viewmodel.QuizViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val quizViewModel : QuizViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quizViewModel.quizModel.observe(this, Observer {
            binding.tvQuestion.text = it.question
            binding.tvAnswer1.text = it.answer1
            binding.tvAnswer2.text = it.answer2
            binding.tvAnswer3.text = it.answer3
            binding.tvCorrectAnswer.text = it.correctAnswer.toString()
        })

        quizViewModel.randomQuestion()
    }
}