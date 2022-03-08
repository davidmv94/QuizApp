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

    fun randomQuestion(){
        quizModel.postValue(QuizProvider.random())
    }
}