package com.davidthar.quizapp.view

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityScoreBinding
import com.davidthar.quizapp.model.QuizApp
import com.davidthar.quizapp.model.database.RankingEntity
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

private lateinit var binding : ActivityScoreBinding
private var points = 0

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val points = bundle?.getInt("points")

        binding.tvScore.text = points.toString()
        initButton()
    }

    private fun initButton() {
        binding.buttonRanking.setOnClickListener{
            if (binding.etRankingName.text.isNotEmpty()){
                doAsync {
                    QuizApp.database.rankingDao().addToRanking(
                        RankingEntity(name = binding.etRankingName.text.toString(),points = points!!))

                    uiThread {
                        startRankingActivity()
                    }
                }
            }else{
                Toast.makeText(this,"Por favor, escribe un nombre",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun startRankingActivity(){
        val intent = Intent(this,RankingActivity::class.java)
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }

    //Deactivate Back at this Activity
    override fun onBackPressed() {}
}
