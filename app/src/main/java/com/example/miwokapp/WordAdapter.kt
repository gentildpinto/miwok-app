package com.example.miwokapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class WordAdapter(context: Activity, words: ArrayList<Word>) : ArrayAdapter<Word>(
    context, 0, words
) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItemView = convertView
            ?: LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false
            )

        val currentWord = getItem(position) as Word

        val miwokTranslationTextView =
            listItemView.findViewById<TextView>(R.id.miwok_translation)
        miwokTranslationTextView.text = currentWord.miwokTranslation

        val defaultTranslationTextView =
            listItemView.findViewById<TextView>(R.id.default_translation)
        defaultTranslationTextView.text = currentWord.defaultTranslation

        val itemImageView =
            listItemView.findViewById<ImageView>(R.id.item_image_view)

        if(currentWord.imageResourceID != null) {
            itemImageView.setImageResource(currentWord.imageResourceID!!)
        } else {
            itemImageView.visibility = View.GONE
        }


        return listItemView
    }
}