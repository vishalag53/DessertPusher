package com.example.dessertpusher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.dessertpusher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity","onCreate Called")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }
}