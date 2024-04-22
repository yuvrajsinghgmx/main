package com.example.myapp

import android.app.Activity
import android.media.tv.TvView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomList(val context: Activity,val arrayList: ArrayList<User>):
ArrayAdapter<User>(context,R.layout.activity_custom_list,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.activity_custom_list,null)
//        val name=view.findViewById<TextView>(R.id.name)
        return super.getView(position, convertView, parent)
    }


}