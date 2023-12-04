package com.example.myprotfolip

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = findViewById<ImageButton>(R.id.emailButton)
        val call = findViewById<ImageButton>(R.id.call)
        val github = findViewById<ImageButton>(R.id.githubButton)
        val link = findViewById<ImageButton>(R.id.linkedinButton)

        email.setOnClickListener {
            val subject = "For Enquiry"
            val email = "psofficial835@gmail.com"
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:$email")
            intent.putExtra(Intent.EXTRA_SUBJECT,subject)
            startActivity(intent)
        }
        call.setOnClickListener{
            val num = +919760391909
            val intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:$num"))
            startActivity(intent)
        }
        github.setOnClickListener{
            val url = "https://github.com/Aman-bot-Coder/"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("$url"))
            startActivity(intent)
        }
        link.setOnClickListener{
            val url = "https://www.linkedin.com/in/prashant-saxena-433492201/"
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("$url"))
            startActivity(intent)
        }

    }
}