    package com.example.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

    class MainActivity : AppCompatActivity(), View.OnClickListener {

    // create object view instance
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    // buat array string
    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // memperkenalkan object view pada layout ke Activity
        btnSetValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_text)

        // buat event ketika tombol ditekan
        btnSetValue!!.setOnClickListener(this)

        names.add("Narenda Wicaksono")
        names.add("Kevin")
        names.add("Yoza")
    }

        override fun onClick(p0: View?) {
                if (p0?.id == R.id.btn_set_value) {
                    Log.d("MainActivity", names.toString())
                    val name = StringBuilder()
                    for (i in 0..2) {
                        name.append(names[i]).append("\n")
                    }
                    tvText.text = name.toString()
            }
        }
    }