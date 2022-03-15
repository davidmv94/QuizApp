package com.davidthar.quizapp.view

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.davidthar.quizapp.QuizApp
import com.davidthar.quizapp.QuizApp.Companion.database
import com.davidthar.quizapp.database.RankingEntity
import com.davidthar.quizapp.databinding.ActivityMainBinding
import com.davidthar.quizapp.viewmodel.QuizViewModel
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

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
    }
}