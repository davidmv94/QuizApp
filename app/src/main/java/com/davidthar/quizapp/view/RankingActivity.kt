package com.davidthar.quizapp.view

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.davidthar.quizapp.model.QuizApp
import com.davidthar.quizapp.model.database.RankingEntity
import com.davidthar.quizapp.databinding.ActivityRankingBinding
import com.davidthar.quizapp.model.RecyclerAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

private lateinit var binding : ActivityRankingBinding
private lateinit var recyclerView : RecyclerView
private lateinit var ranking : MutableList<RankingEntity>

class RankingActivity : AppCompatActivity() {

    private val recyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRankingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getRanking()
        setUpRecyclerView()
        initBackButton()
    }

    private fun setUpRecyclerView(){

        recyclerView = binding.rvRanking
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerAdapter.RecyclerAdapter(ranking, this)
        recyclerView.adapter = recyclerAdapter
    }

    private fun getRanking(){
        doAsync {
            ranking = QuizApp.database.rankingDao().getTenRanking()
            println(ranking.toString())
        }
    }

    private fun initBackButton() {
        binding.btnBack.setOnClickListener {
            this.onBackPressed()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
    }
}