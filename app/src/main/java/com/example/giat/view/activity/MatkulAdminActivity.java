package com.example.giat.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.giat.R;

public class MatkulAdminActivity extends AppCompatActivity {
    Button tambahMatkul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matkul_admin);

        tambahMatkul = findViewById(R.id.btn_tambahMatkul);
        tambahMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MatkulAdminActivity.this, AddMatkulActivity.class));
            }
        });
    }
}