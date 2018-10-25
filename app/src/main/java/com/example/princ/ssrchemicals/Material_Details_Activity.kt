package com.example.princ.ssrchemicals

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_material__details_.*
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout








class Material_Details_Activity : AppCompatActivity() {


    private val parentLinearLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material__details_)

        add_field_button.setOnClickListener()
        {
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val rowView = inflater.inflate(R.layout.field, null)
            // Add the new row before the add field button.
            parentLinearLayout?.addView(rowView, parentLinearLayout.childCount - 1)
        }


        delete_button.setOnClickListener()
        {
            parentLinearLayout?.removeView(parent as View)
        }
    }


}
