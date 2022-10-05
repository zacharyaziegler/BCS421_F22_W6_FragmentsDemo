package edu.farmingdale.bcs421.bcs421_f22_w6_fragmentsdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.helloWorldTV).setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}