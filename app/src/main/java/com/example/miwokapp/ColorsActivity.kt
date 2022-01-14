package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
            .apply {
                add(Word("red", "weṭeṭṭi", R.drawable.color_red))
                add(Word("green", "chokokki", R.drawable.color_green))
                add(Word("brown", "ṭakaakki", R.drawable.color_brown))
                add(Word("gray", "ṭopoppi", R.drawable.color_gray))
                add(Word("black", "kululli", R.drawable.color_black))
                add(Word("white", "kelelli", R.drawable.color_white))
                add(Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow))
                add(Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow))
            }

        findViewById<ListView>(R.id.word_list_view).adapter = WordAdapter(this, words)
    }
}