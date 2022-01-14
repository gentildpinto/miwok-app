package com.example.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        val words = ArrayList<Word>()
            .apply {
                add(Word("father", "әpә", R.drawable.family_father))
                add(Word("mother", "әṭa", R.drawable.family_mother))
                add(Word("son", "angsi", R.drawable.family_son))
                add(Word("daughter", "tune", R.drawable.family_daughter))
                add(Word("older brother", "taachi", R.drawable.family_older_brother))
                add(Word("younger brother", "chalitti", R.drawable.family_younger_brother))
                add(Word("older sister", "teṭe", R.drawable.family_older_sister))
                add(Word("younger sister", "kolliti", R.drawable.family_younger_sister))
                add(Word("grandmother", "ama", R.drawable.family_grandmother))
                add(Word("grandfather", "paapa", R.drawable.family_grandfather))
            }

        findViewById<ListView>(R.id.word_list_view).adapter = WordAdapter(this, words)
    }
}