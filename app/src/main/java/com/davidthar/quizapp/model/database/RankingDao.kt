package com.davidthar.quizapp.model.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/*
** Coded by David Montes on 15/03/2022.
** https://github.com/davidthar
*/

@Dao
interface RankingDao {

    @Query("SELECT * FROM ranking_table order BY points desc LIMIT 10")
    fun getTenRanking() : MutableList<RankingEntity>

    @Insert
    fun addToRanking(rankingEntity: RankingEntity)
}