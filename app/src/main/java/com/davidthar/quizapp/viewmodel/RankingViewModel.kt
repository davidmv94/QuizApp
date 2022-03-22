package com.davidthar.quizapp.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.davidthar.quizapp.model.QuizApp
import com.davidthar.quizapp.model.RecyclerAdapter
import com.davidthar.quizapp.model.database.RankingEntity
import org.jetbrains.anko.doAsync

/*
** Coded by David Montes on 21/03/2022.
** https://github.com/davidthar
*/


private lateinit var recyclerView : RecyclerView

class RankingViewModel : ViewModel() {

    private val recyclerAdapter = RecyclerAdapter()

    fun addScore(name : String, points : Int){
        doAsync {
            QuizApp.database.rankingDao().addToRanking(RankingEntity(name = name,points = points))
        }
    }

    fun updateRanking(){
        doAsync {
            QuizApp.ranking = QuizApp.database.rankingDao().getTenRanking()
        }
    }

    fun setRecyclerView(context : Context, myRecyclerView: RecyclerView){
        recyclerView = myRecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerAdapter.RecyclerAdapter(QuizApp.ranking, context)
        recyclerView.adapter = recyclerAdapter
    }
}