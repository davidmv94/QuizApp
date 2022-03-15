package com.davidthar.quizapp.database

import androidx.room.Database
import androidx.room.RoomDatabase

/*
** Coded by David Montes on 15/03/2022.
** https://github.com/davidthar
*/

@Database(entities = [RankingEntity::class], version = 1)
abstract class RankingDatabase : RoomDatabase() {
    abstract fun rankingDao() : RankingDao
}