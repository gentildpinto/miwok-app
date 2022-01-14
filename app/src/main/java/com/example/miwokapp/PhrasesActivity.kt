package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
            .apply {
                add(Word("Where are you going?", "minto wuksus"))
                add(Word("What is your name?", "tinnә oyaase'nә"))
                add(Word("My name is...", "oyaaset..."))
                add(Word("How are you feeling?", "michәksәs?"))
                add(Word("I’m feeling good.", "kuchi achit"))
                add(Word("Are you coming?", "әәnәs'aa?"))
                add(Word("Yes, I’m coming.", "hәә’ әәnәm"))
                add(Word("I’m coming.", "әәnәm"))
                add(Word("Let’s go.", "yoowutis"))
                add(Word("Come here.", "әnni'nem"))
            }

        findViewById<ListView>(R.id.word_list_view).adapter = WordAdapter(this, words)
    }
}