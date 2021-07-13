package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name=intent.getStringExtra(key1)
        val mobile=intent.getIntExtra(key2,0)
        val isStu=intent.getBooleanExtra(key3,false)
        val textid=findViewById<TextView>(R.id.text1)
        textid.text="name $name \n mobile no $mobile \n  you are student $isStu"
    }
}