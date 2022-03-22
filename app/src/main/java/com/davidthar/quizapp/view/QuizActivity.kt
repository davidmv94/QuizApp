package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.Button
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityQuizBinding
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.davidthar.quizapp.model.extensions.changeActivity
import com.davidthar.quizapp.model.extensions.clear
import com.davidthar.quizapp.model.extensions.correct
import com.davidthar.quizapp.model.extensions.incorrect
import com.davidthar.quizapp.viewmodel.QuizViewModel
import java.text.DecimalFormat
import java.text.NumberFormat
import kotlin.random.Random


class QuizActivity : AppCompatActivity() {

    private lateinit var binding : ActivityQuizBinding
    private val quizViewModel : QuizViewModel by viewModels()
    private lateinit var timer : CountDownTimer
    private lateinit var randomSet : HashSet<Int>
    private lateinit var arrayAnswerButtons : Array<Button>

    private var correctAnswer = 0
    private var questionNumber = 1
    private var totalPoints = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        randomSet = createRandomArray()
        arrayAnswerButtons = arrayOf(binding.btnAnswer1, binding.btnAnswer2, binding.btnAnswer3)

        loadFirstQuestion()
        initBackButton()
    }

    private fun loadFirstQuestion() {
        quizViewModel.quizModel.observe(this, {

            //Load Image
            val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
            Glide.with(this).load(it.url).apply(requestOptions).into(binding.ivImage)

            //Load Question and answers
            binding.tvQuestion.text = it.question
            binding.btnAnswer1.text = it.answer1
            binding.btnAnswer2.text = it.answer2
            binding.btnAnswer3.text = it.answer3
            correctAnswer = it.correctAnswer
        })

        //Set first question and Countdown
        quizViewModel.setQuestion(randomSet)
        setCountDown()
    }

    private fun createRandomArray(): HashSet<Int>{
        val size = 10
        val s = HashSet<Int>(size)
        while (s.size < size) {
            s += Random.nextInt(0,30)
        }
        return  s
    }

    private fun setCountDown(){

        timer = object : CountDownTimer(31000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                val f: NumberFormat = DecimalFormat("00")
                val sec = millisUntilFinished / 1000 % 60
                binding.tvTimer.text = f.format(sec)
                binding.progressBarCircle.progress = f.format(sec).toInt()
            }

            override fun onFinish() {
                timer.cancel()
                arrayAnswerButtons[correctAnswer-1].setBackgroundColor(ResourcesCompat.getColor(resources,R.color.green_color,null))
                arrayAnswerButtons[correctAnswer-1].setTextColor(ResourcesCompat.getColor(resources,R.color.white,null))
                setDelay()
            }
        }

        setAnswerButtons()

        timer.start()
    }

    private fun setAnswerButtons(){
        arrayAnswerButtons.forEach { answerButton ->
            answerButton.setOnClickListener {
                timer.cancel()

                if(answerButton.tag.toString().toInt() == correctAnswer){
                    totalPoints = answerButton.correct(totalPoints, binding.tvTimer)
                }else{
                    answerButton.incorrect(arrayAnswerButtons, correctAnswer)
                }

                //Unclickable until delay finishes
                arrayAnswerButtons.forEach { it.setOnClickListener {  } }

                //Start 1 second delay
                setDelay()
            }

        }
    }

    private fun setDelay(){
        Handler(Looper.getMainLooper()).postDelayed(
            {
                if(questionNumber == 10){
                    changeActivity(ScoreActivity(),totalPoints)
                }else{
                    quizViewModel.setQuestion(randomSet)
                    arrayAnswerButtons.forEach { it.clear() }
                    setCountDown()
                    questionNumber++
                }
            },1000)
    }

    private fun initBackButton() {
        binding.btnBack.setOnClickListener {
            this.onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        timer.cancel()
    }
}