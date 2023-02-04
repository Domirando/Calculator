package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var problem = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero.setOnClickListener(this)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        clear.setOnClickListener(this)
        equal.setOnClickListener(this)
        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        mult.setOnClickListener(this)
        div.setOnClickListener(this)
        backspace.setOnClickListener(this)
        dot.setOnClickListener(this)
        pos_neg.setOnClickListener(this)
        percent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
    }
}