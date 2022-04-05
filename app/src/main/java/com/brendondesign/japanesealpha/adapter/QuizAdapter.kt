package com.brendondesign.japanesealpha.adapter

import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.brendondesign.japanesealpha.R
import com.brendondesign.japanesealpha.SortedCards

class QuizAdapter (private val cardlist : ArrayList<SortedCards>) : RecyclerView.Adapter<QuizAdapter.CardViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizAdapter.CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_guesser,parent,false)
        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: QuizAdapter.CardViewHolder, position: Int) {
        val currentItem = cardlist[position]
        holder.title.text = currentItem.title
        holder.quessLetters.setText("")

    }

    override fun getItemCount(): Int {
        return cardlist.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

        val title : TextView = itemView.findViewById(R.id.letterSelected)
        val quessLetters : EditText = itemView.findViewById(R.id.letterGuess)

    }
}