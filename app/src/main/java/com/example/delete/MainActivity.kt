package com.example.delete

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class UserListAdapter(mainActivity: MainActivity, array: ArrayList<UserModel>) {



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var array:ArrayList<>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf(
            UserModel("Pradeep kumar", 18, R.drawable.baseline_access_time_filled_24),
            UserModel("Rahul kumar", 19, R.drawable.baseline_access_time_filled_24),
            UserModel("Saif Ali", 17, R.drawable.baseline_access_time_filled_24),
            UserModel("Raj kumar", 26, R.drawable.baseline_access_time_filled_24),
            UserModel("Pradeep kumar", 18, R.drawable.baseline_access_time_filled_24)

        )


        val userList = findViewById<ListView>(R.id.list_item)
        val adapter = UserListAdapter(this, array)
        userList.adapter= adapter
    }


}
}