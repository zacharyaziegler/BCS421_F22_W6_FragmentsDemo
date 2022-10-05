package edu.farmingdale.bcs421.bcs421_f22_w6_fragmentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var mBtn1:Button
    lateinit var mBtn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        var frgmnt01 = Fragment01()
        var frgmnt02 = Fragment02()


        mBtn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framelayout1, frgmnt01)
                commit()
            }
        }
        mBtn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.framelayout1, frgmnt02)
                commit()
            }
        }
    }
}