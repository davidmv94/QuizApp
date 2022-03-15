package com.davidthar.quizapp.model.database

import androidx.room.Entity
import androidx.room.PrimaryKey

/*
** Coded by David Montes on 15/03/2022.
** https://github.com/davidthar
*/

@Entity(tableName = "ranking_table")
data class RankingEntity (
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,
    var name : String,
    var points : Int
    )