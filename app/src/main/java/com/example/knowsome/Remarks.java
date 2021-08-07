package com.example.knowsome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Remarks extends AppCompatActivity {
     Button bo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest);
        bo= findViewById(R.id.bo);
        getSupportActionBar().setTitle("Remarks");
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Remarks.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}

