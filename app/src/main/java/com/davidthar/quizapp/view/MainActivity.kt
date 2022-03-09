package com.davidthar.quizapp.view

import android.app.ActivityOptions
import android.content.Intent
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

        binding.btnInformation.setOnClickListener {
            val intent = Intent(this,InfoActivity::class.java)
            startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

        binding.btnRanking.setOnClickListener {
            val intent = Intent(this,RankingActivity::class.java)
            startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

        binding.btnPlay.setOnClickListener {
            val intent = Intent(this,QuizActivity::class.java)
            startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

        /*quizViewModel.quizModel.observe(this, Observer {
            binding.tvQuestion.text = it.question
            binding.tvAnswer1.text = it.answer1
            binding.tvAnswer2.text = it.answer2
            binding.tvAnswer3.text = it.answer3
            binding.tvCorrectAnswer.text = it.correctAnswer.toString()
        })

        binding.viewContainer.setOnClickListener {
            quizViewModel.randomQuestion()
        }

         */
    }
}