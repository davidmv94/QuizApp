package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.davidthar.quizapp.databinding.ActivityRankingBinding
import com.davidthar.quizapp.model.extensions.changeActivity
import com.davidthar.quizapp.viewmodel.RankingViewModel

private lateinit var binding : ActivityRankingBinding

class RankingActivity : AppCompatActivity() {

    private val rankingViewModel : RankingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRankingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
        initBackButton()
    }

    private fun setUpRecyclerView(){
        rankingViewModel.setRecyclerView(this,binding.rvRanking)
    }

    private fun initBackButton() {
        binding.btnBack.setOnClickListener { this.onBackPressed() }
    }

    override fun onBackPressed() {
        changeActivity(MainActivity())
    }
}