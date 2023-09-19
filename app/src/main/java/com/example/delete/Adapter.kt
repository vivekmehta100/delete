package com.example.delete

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AddapterStudent(val context: Context, val item : ArrayList<UserModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return item.size
    }

    override fun getItem(p0: Int): Any {
        return item[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layout = LayoutInflater.from(context).inflate(R.layout.activity_main, p2, false)

//        val image = layout.findViewById<ImageView>(R.id.studentImage)
//        val name = layout.findViewById<TextView>(R.id.studentName)
//        val email = layout.findViewById<TextView>(R.id.studentEmail)

//        image.setImageResource(item[p0].image)
//        name.text = item[p0].name
//        email.text = item[p0].email

        return layout
    }
}
