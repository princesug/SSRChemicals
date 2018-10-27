package com.example.princ.ssrchemicals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_operations.*

class OperationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operations)

    button1.setOnClickListener()
    {
        val intent = Intent(this,MaterialInspectionActivity::class.java)
        startActivity(intent)
    }

    button2.setOnClickListener()
    {
        val intent = Intent(this,MaterialPickupActivity::class.java)
        startActivity(intent)
    }

    button3.setOnClickListener()
    {
        val intent = Intent(this,CustomerVisitActivity::class.java)
        startActivity(intent)
    }

        btnLogout.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
