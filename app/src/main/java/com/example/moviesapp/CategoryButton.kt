package com.example.moviesapp

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView

class CategoryButton(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.category_button, this@CategoryButton)
        context.theme.obtainStyledAttributes(attrs, R.styleable.CategoryButton, 0, 0).apply {
            try {
                findViewById<TextView>(R.id.emojiIcon).text = getString(R.styleable.CategoryButton_emojiIcon)
                findViewById<TextView>(R.id.buttonTitle).text = getString(R.styleable.CategoryButton_buttonTitle)
            } finally {
                recycle()
            }
        }
    }

}