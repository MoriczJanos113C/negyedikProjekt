package com.example.negyedikprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Szamologep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szamologep);

        EditText a = findViewById(R.id.a);
        EditText b = findViewById(R.id.b);

        Button osszeadas = findViewById(R.id.osszeadas);
        Button kivonas = findViewById(R.id.kivonas);
        Button szorzas = findViewById(R.id.szorzas);
        Button osztas = findViewById(R.id.osztas);

        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Szamologep.this,Final.class);
                int x = Integer.parseInt(a.getText().toString());
                int y = Integer.parseInt(b.getText().toString());
                i.putExtra("eredmeny2", String.valueOf(y+x));

                startActivity(i);
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Szamologep.this,Final.class);
                int x = Integer.parseInt(a.getText().toString());
                int y = Integer.parseInt(b.getText().toString());
                i.putExtra("eredmeny2", String.valueOf(y*x));

                startActivity(i);
            }
        });
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Szamologep.this,Final.class);
                int x = Integer.parseInt(a.getText().toString());
                int y = Integer.parseInt(b.getText().toString());
                i.putExtra("eredmeny2", String.valueOf(y-x));

                startActivity(i);
            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Szamologep.this,Final.class);
                int x = Integer.parseInt(a.getText().toString());
                int y = Integer.parseInt(b.getText().toString());
                i.putExtra("eredmeny2", String.valueOf(y/x));

                startActivity(i);
            }
        });




    }
}