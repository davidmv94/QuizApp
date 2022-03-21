package com.davidthar.quizapp.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.davidthar.quizapp.R
import com.davidthar.quizapp.model.database.RankingEntity

/*
** Coded by David Montes on 21/03/2022.
** https://github.com/davidthar
*/

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var ranking: MutableList<RankingEntity>  = ArrayList()
    lateinit var context: Context

    fun RecyclerAdapter(ranking : MutableList<RankingEntity>, context: Context){
        this.ranking = ranking
        this.context = context
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = ranking[position]
        holder.bind(item, context, position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.ranking_item, parent, false))
    }
    override fun getItemCount(): Int {
        return ranking.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val position = view.findViewById(R.id.tvPosition) as TextView
        val name = view.findViewById(R.id.tvName) as TextView
        private val points = view.findViewById(R.id.tvPoints) as TextView

        fun bind(ranking:RankingEntity, context : Context, positionNumber : Int){
            position.text = (positionNumber+1).toString()
            name.text = ranking.name
            points.text = ranking.points.toString()
        }
    }
}