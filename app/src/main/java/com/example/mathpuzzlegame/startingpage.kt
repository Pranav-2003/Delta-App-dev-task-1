package com.example.mathpuzzlegame
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class startingpage:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)
    }

    fun start(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}