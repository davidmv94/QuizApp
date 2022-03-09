package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityInfoBinding
import com.davidthar.quizapp.databinding.ActivityRankingBinding

private lateinit var binding : ActivityRankingBinding

class RankingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRankingBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnBack.setOnClickListener {
            this.onBackPressed()
        }
    }
}