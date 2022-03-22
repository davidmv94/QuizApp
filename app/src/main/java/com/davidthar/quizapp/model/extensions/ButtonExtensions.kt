package com.davidthar.quizapp.model.extensions

import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.davidthar.quizapp.R

/*
** Coded by David Montes on 22/03/2022.
** https://github.com/davidthar
*/

fun Button.correct(totalPoints : Int, textView: TextView) : Int{
    var points = totalPoints
    this.setBackgroundColor(ResourcesCompat.getColor(resources,R.color.green_color,null))
    this.setTextColor(ResourcesCompat.getColor(resources,R.color.white,null))
    points += textView.text.toString().toInt()

    return points
}

fun Button.incorrect(arrayAnswerButtons : Array<Button>, correctAnswer : Int){
    //Incorrect to RED
    this.setBackgroundColor(ResourcesCompat.getColor(resources,R.color.red_color,null))
    this.setTextColor(ResourcesCompat.getColor(resources,R.color.white,null))

    //Correct to GREEN
    arrayAnswerButtons[correctAnswer-1].setBackgroundColor(ResourcesCompat.getColor(resources,R.color.green_color,null))
    arrayAnswerButtons[correctAnswer-1].setTextColor(ResourcesCompat.getColor(resources,R.color.white,null))
}

fun Button.clear(){
    this.setBackgroundColor(ResourcesCompat.getColor(resources,R.color.background_dark,null))
    this.setTextColor(ResourcesCompat.getColor(resources,R.color.text_color_darker,null))
}