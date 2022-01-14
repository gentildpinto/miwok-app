package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
            .apply {
                add(Word("one", "lutti", R.drawable.number_one))
                add(Word("two", "otiiko", R.drawable.number_two))
                add(Word("three", "tolookosu", R.drawable.number_three))
                add(Word("four", "oyyisa", R.drawable.number_four))
                add(Word("five", "massokka", R.drawable.number_five))
                add(Word("six", "temmokka", R.drawable.number_six))
                add(Word("seven", "kenekaku", R.drawable.number_seven))
                add(Word("eight", "kawinta", R.drawable.number_eight))
                add(Word("nine", "wo’e", R.drawable.number_nine))
                add(Word("ten", "na’aacha", R.drawable.number_ten))
            }

        findViewById<ListView>(R.id.word_list_view).adapter = WordAdapter(this, words)
    }
}