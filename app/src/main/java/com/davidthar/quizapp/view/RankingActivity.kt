package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.model.QuizApp
import com.davidthar.quizapp.model.database.RankingEntity
import com.davidthar.quizapp.databinding.ActivityRankingBinding
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

private lateinit var binding : ActivityRankingBinding

private lateinit var ranking : MutableList<RankingEntity>

class RankingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRankingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rankingNames = arrayOf(
            binding.tvRankingName1,binding.tvRankingName2,binding.tvRankingName3,binding.tvRankingName4,binding.tvRankingName5,
            binding.tvRankingName6,binding.tvRankingName7,binding.tvRankingName8,binding.tvRankingName9,binding.tvRankingName10)

        val rankingPoints = arrayOf(
            binding.tvRankingPoints1,binding.tvRankingPoints2,binding.tvRankingPoints3,binding.tvRankingPoints4,binding.tvRankingPoints5,
            binding.tvRankingPoints6,binding.tvRankingPoints7,binding.tvRankingPoints8,binding.tvRankingPoints9,binding.tvRankingPoints10)


        //Get ranking

        ranking = ArrayList()

        doAsync {
            ranking = QuizApp.database.rankingDao().getTenRanking()

            uiThread {
                var indexNames = 0
                rankingNames.forEach {
                    it.text = ranking[indexNames].name
                    indexNames++
                }

                var indexPoints = 0
                rankingPoints.forEach {
                    it.text = ranking[indexPoints].points.toString()
                    indexPoints++
                }
            }



        }


        binding.btnBack.setOnClickListener {
            this.onBackPressed()
        }
    }
}