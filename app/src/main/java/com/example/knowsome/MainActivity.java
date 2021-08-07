package com.example.knowsome;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button luga,luso;
    TextView text;
    Button btn;
    Button bt;
    boolean display = false;
    String text1 = "know what you don't know";
    String text2 ="rates are of high vales if you give some ratings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luga = findViewById(R.id.luga);
        luso = findViewById(R.id.luso);
        bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Latest.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        text = findViewById(R.id.text);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("clicked");
                if(display){
                    text.setText(text2);
                    display = false;
                }else{
                    text.setText(text1);
                    display = true;
                }

            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         switch (item.getItemId()){
             case R.id.home:
                 Toast.makeText(getApplicationContext(), "Home icon pressed", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.search:
                 Toast.makeText(getApplicationContext(), "search icon pressed", Toast.LENGTH_SHORT).show();
                 break;
             default:
                 Toast.makeText(getApplicationContext(), "back icon pressed", Toast.LENGTH_SHORT).show();

         }
        return super.onOptionsItemSelected(item);
    }

    public void makeToast (String s) {
        Toast.makeText(getApplicationContext(),s, Toast.LENGTH_SHORT).show();
    }
}