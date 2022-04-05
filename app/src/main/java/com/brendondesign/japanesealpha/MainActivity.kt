package com.brendondesign.japanesealpha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)
        val aButton : CheckBox = findViewById(R.id.AcheckBox)
        val kaButton : CheckBox = findViewById(R.id.KAcheckBox)
        val taButton : CheckBox = findViewById(R.id.TAcheckBox)
        val saButton : CheckBox = findViewById(R.id.SAcheckBox)
        val haButton : CheckBox = findViewById(R.id.HAcheckBox)
        val maButton : CheckBox = findViewById(R.id.MAcheckBox)
        val naButton : CheckBox = findViewById(R.id.NAcheckBox)
        val yaButton : CheckBox = findViewById(R.id.YAcheckBox)

        var newlist : MutableList<String> = arrayListOf()



        if(aButton.isChecked)
        {
            newlist.add("a")
        }
        if(kaButton.isChecked)
        {
            newlist.add("ka")
        }
        if(saButton.isChecked)
        {
            newlist.add("sa")
        }
        if(taButton.isChecked)
        {
            newlist.add("ta")
        }
        if(naButton.isChecked)
        {
            newlist.add("na")
        }
        if(haButton.isChecked)
        {
            newlist.add("ha")
        }
        if(maButton.isChecked)
        {
            newlist.add("ma")
        }
        if(yaButton.isChecked)
        {
            newlist.add("ya")
        }



        button.setOnClickListener{
            if(aButton.isChecked)
            {
                newlist.add("a")
            }
            if(kaButton.isChecked)
            {
                newlist.add("ka")
            }
            if(saButton.isChecked)
            {
                newlist.add("sa")
            }
            if(taButton.isChecked)
            {
                newlist.add("ta")
            }
            if(naButton.isChecked)
            {
                newlist.add("na")
            }
            if(haButton.isChecked)
            {
                newlist.add("ha")
            }
            if(maButton.isChecked)
            {
                newlist.add("ma")
            }
            if(yaButton.isChecked)
            {
                newlist.add("ya")
            }

            newlist.toTypedArray()
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            intent.putStringArrayListExtra("test", (ArrayList(newlist)))

            startActivity(intent)
        }
    }


}