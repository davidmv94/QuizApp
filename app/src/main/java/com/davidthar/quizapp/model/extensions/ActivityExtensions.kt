package com.davidthar.quizapp.model.extensions

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.net.Uri
import android.widget.Toast

/*
** Coded by David Montes on 22/03/2022.
** https://github.com/davidthar
*/

fun Activity.showToast(text : String, duration : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, duration).show()
}

fun Activity.changeActivity(activity : Activity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
}

fun Activity.changeActivity(activity : Activity, totalPoints : Int){
    val intent = Intent(this, activity::class.java)
    intent.putExtra("points",totalPoints)
    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
}

fun Activity.linkTo(uri : Int){
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(resources.getString(uri))))
}