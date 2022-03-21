package com.davidthar.quizapp.viewmodel

import androidx.lifecycle.ViewModel
import com.davidthar.quizapp.model.QuizApp
import com.davidthar.quizapp.model.database.RankingEntity
import org.jetbrains.anko.doAsync

/*
** Coded by David Montes on 21/03/2022.
** https://github.com/davidthar
*/



class RankingViewModel : ViewModel() {

    fun addScore(name : String, points : Int){
        doAsync {
            QuizApp.database.rankingDao().addToRanking(RankingEntity(name = name,points = points))
        }
    }



    private fun getRankingFromDatabase(ranking : MutableList<RankingEntity>){
        doAsync {
            ranking = QuizApp.database.rankingDao().getTenRanking()
        }
    }
}