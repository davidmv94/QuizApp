package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.davidthar.quizapp.databinding.ActivityScoreBinding
import com.davidthar.quizapp.model.extensions.changeActivity
import com.davidthar.quizapp.model.extensions.showToast
import com.davidthar.quizapp.viewmodel.RankingViewModel

private lateinit var binding : ActivityScoreBinding
private var points = 0

class ScoreActivity : AppCompatActivity() {

    private val rankingViewModel : RankingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        points = bundle?.getInt("points")!!
        binding.tvScore.text = points.toString()
        initButton()
    }

    private fun initButton() {
        binding.buttonRanking.setOnClickListener{
            if (binding.etRankingName.text.isNotEmpty()){
                val name = binding.etRankingName.text.toString()
                rankingViewModel.addScore(name, points)
                rankingViewModel.updateRanking()
                Handler(Looper.getMainLooper()).postDelayed({ startRankingActivity() },1000)
            }else{
                showToast("Por favor, escribe un nombre")
            }
        }
    }

    private fun startRankingActivity(){
        changeActivity(RankingActivity())
    }

    //Deactivate Back at this Activity
    override fun onBackPressed() {}
}
