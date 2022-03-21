package com.davidthar.quizapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davidthar.quizapp.R
import com.davidthar.quizapp.databinding.ActivityInfoBinding
import com.davidthar.quizapp.model.linkTo

private lateinit var binding : ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setLinks()
        setBackButton()
    }

    private fun setLinks() {
        binding.ivGithub.setOnClickListener { linkTo(R.string.my_github_uri) }
        binding.ivTwitter.setOnClickListener { linkTo(R.string.my_twitter_uri) }
        binding.moureGit.setOnClickListener { linkTo(R.string.mouredev_github_uri) }
    }

    private fun setBackButton() {
        binding.btnBack.setOnClickListener { this.onBackPressed() }
    }
}