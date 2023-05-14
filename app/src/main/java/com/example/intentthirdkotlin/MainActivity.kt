package com.example.intentthirdkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.intentthirdkotlin.model.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        var b_check = findViewById<Button>(R.id.b_check)
        b_check.setOnClickListener {
            var student =Student(21 , "Zuhriddin")
            openSecondActivity(student)}
    }

    fun openSecondActivity(student :Student){
        var intentz = Intent(this , SecondActivity::class.java)
        intentz.putExtra("kalit" , student)
        startActivity(intentz)
    }
}