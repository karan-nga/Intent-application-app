package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val key1="Name"
const val key2="MNo"
const val key3="isStudent"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra(key1, "Karan")
            i.putExtra(key2, 981709433)
            i.putExtra(key3, true)
            startActivity(i)
        }
            val mail = findViewById<Button>(R.id.mail)
            val edit = findViewById<EditText>(R.id.editTextTextPersonName)
            mail.setOnClickListener {
                val email = edit.text.toString()
                val i1 = Intent()
                i1.action = Intent.ACTION_SENDTO
                i1.data = Uri.parse("mailto:$email")
                startActivity(i1)
            }
        val browse=findViewById<Button>(R.id.brow)
        browse.setOnClickListener{
            val add=edit.text.toString()
            val i2=Intent()
            i2.action=Intent.ACTION_VIEW
            i2.data= Uri.parse("http://$add")
            startActivity(i2)
        }
        val dial=findViewById<Button>(R.id.dial)
        dial.setOnClickListener{
            val dial=edit.text.toString()  //we get data in dial rom our text view
            val i3=Intent() //here we create the object Intent class
            i3.action=Intent.ACTION_DIAL //action is view type it differnt for all activites
            i3.data= Uri.parse("tel:$dial") //uri mean
            startActivity(i3)
        }

    }
}