package com.example.negyedikprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button szamologepre = findViewById(R.id.szamologepre);
        Button teruletkeruletszamitasra = findViewById(R.id.teruletkeruletszamitasra);

        szamologepre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Szamologep.class);
                startActivity(i);
            }
        });

        teruletkeruletszamitasra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,KeruletTerulet.class);
                startActivity(i);
            }
        });
    }
}