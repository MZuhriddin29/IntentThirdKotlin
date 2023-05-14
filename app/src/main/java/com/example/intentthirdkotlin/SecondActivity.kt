package com.example.intentthirdkotlin

import android.content.Intent
import android.os.Bundle
import android.view.ActionMode
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.intentthirdkotlin.model.Student

class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()

    }
    fun initView(){
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var student =intent.getParcelableExtra<Student>("kalit")
        tv_second.text = student.toString()
    }
}