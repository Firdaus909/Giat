package com.example.giat.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import com.example.giat.R


class AddMatkulActivity : AppCompatActivity() {
    private lateinit var addFunc: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_matkul)

        addFunc = findViewById(R.id.btn_add)
        addFunc
    }
}