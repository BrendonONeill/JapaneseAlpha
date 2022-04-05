package com.brendondesign.japanesealpha

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brendondesign.japanesealpha.adapter.QuizAdapter


class SecondActivity : AppCompatActivity() {

    lateinit var dog : MutableList<String>
    private lateinit var rc : RecyclerView
    private lateinit var cardArrayList: ArrayList<SortedCards>
    lateinit var aletters : Array<String>
    lateinit var kaletters : Array<String>
    lateinit var saletters : Array<String>
    lateinit var taletters : Array<String>
    lateinit var naletters : Array<String>
    lateinit var haletters : Array<String>
    lateinit var maletters : Array<String>
    lateinit var yaletters : Array<String>





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_recycler)
        val button : Button = findViewById(R.id.button2)
        val letterGuess : EditText? = findViewById(R.id.letterGuess)
        val letterSelected : TextView? = findViewById(R.id.letterSelected)
        var testtext = letterGuess?.getText().toString()
        var testSelected = letterSelected?.getText().toString()



        val bundle : Bundle?= intent.extras
        val fish = bundle!!.getStringArrayList("test")

        val cat = fish?.size
        dog = arrayListOf()
        var i = 0
        while (i < cat!!)
        {
            dog.add(fish.get(i))
            i++
        }
        println(dog)



        aletters = arrayOf(
            "あ",
            "え",
            "い",
            "お",
            "う"
        )

        kaletters = arrayOf(
            "か",
            "け",
            "き",
            "こ",
            "く"
        )

        saletters = arrayOf(
            "さ",
            "し",
            "す",
            "せ",
            "そ"
        )

        taletters = arrayOf(
            "た",
            "ち",
            "つ",
            "て",
            "と"
        )

        naletters = arrayOf(
            "な",
            "に",
            "ぬ",
            "ね",
            "の"
        )

        haletters = arrayOf(
            "は",
            "ひ",
            "ふ",
            "へ",
            "ほ"
        )

        maletters = arrayOf(
            "ま",
            "み",
            "む",
            "め",
            "も"
        )

        yaletters = arrayOf(
            "や",
            "ゆ",
            "よ"
        )





        rc = findViewById(R.id.rc)
        rc.layoutManager = GridLayoutManager(this, 4)
        rc.setHasFixedSize(true)
        cardArrayList = arrayListOf<SortedCards>()

        getUserdata()


        button.setOnClickListener {
            Log.i("test", "${testtext}")
            Log.i("test", "${testSelected}")
        }

    }

    private fun getUserdata()
    {
        for(i in dog)
        {
            if(i == "a")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(aletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "ka")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(kaletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "sa")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(saletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "ta")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(taletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "na")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(naletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "ha")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(haletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "ma")
            {
                for(i in aletters.indices)
                {
                    val letter = SortedCards(maletters[i])
                    cardArrayList.add(letter)
                }
            }
            else if(i == "ya")
            {
                for(i in yaletters.indices)
                {
                    val letter = SortedCards(yaletters[i])
                    cardArrayList.add(letter)
                }
            }
        }
        cardArrayList.shuffle()
        Log.i("ArrayRef", "${cardArrayList}")
        rc.adapter = QuizAdapter(cardArrayList)



    }



}