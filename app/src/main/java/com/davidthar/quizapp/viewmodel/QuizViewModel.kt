package com.davidthar.quizapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.davidthar.quizapp.model.QuizModel
import com.davidthar.quizapp.model.QuizProvider

/*
** Coded by David Montes on 08/03/2022.
** https://github.com/davidthar
*/


class QuizViewModel : ViewModel() {
    val quizModel = MutableLiveData<QuizModel>()
    private var questionNumber = 0

    fun setQuestion(randomSet : HashSet<Int>){

        val randomQuestionList = QuizProvider.createQuestionList(randomSet)
        quizModel.postValue(randomQuestionList[questionNumber])
        questionNumber++
    }
}