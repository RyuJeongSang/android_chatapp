package com.example.android_chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mDrawerToggle : ActionBarDrawerToggle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDrawerToggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.open, R.string.close)
        mDrawerToggle!!.syncState()

        val loginIntent = Intent(this, LoginPage::class.java)
        loginBtn.setOnClickListener {
            startActivity(loginIntent)
        }

    }

    fun update(view : View) {
        tv_content.text = (view as TextView).text
        drawer_layout!!.closeDrawer(8388611)
    }
}