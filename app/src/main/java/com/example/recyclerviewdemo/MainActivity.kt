package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var languages = arrayOf<String>("Java", "C", "C#", "paython", "Kotlin", "Go", "Javascript", "Typescript", "Visual Basic");
        programmingList.layoutManager = LinearLayoutManager(this);

        programmingList.adapter = ProgrammingAdapter(languages);
    }
}