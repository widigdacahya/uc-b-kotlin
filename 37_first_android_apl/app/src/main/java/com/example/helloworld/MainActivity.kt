package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun buttonGreetClick(v: View) {
        Toast.makeText(this, "Hwello, Have a Nice Day :D ", Toast.LENGTH_SHORT).show()
    }

}