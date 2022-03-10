package com.davidthar.quizapp.model

/*
** Coded by David Montes on 08/03/2022.
** https://github.com/davidthar
*/

data class QuizModel (val question:String,
                      val url:String,
                      val answer1:String,
                      val answer2:String,
                      val answer3:String,
                      val correctAnswer:Int)