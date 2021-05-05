package com.example.negyedikprojekt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class KeruletTerulet extends AppCompatActivity {

    // 2*a + 2*b
    // a*b

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerureltterulet);

        EditText aoldal = findViewById(R.id.aoldal);
        EditText boldal = findViewById(R.id.boldal);

        Button kerulet = findViewById(R.id.kerulet);
        Button terulet = findViewById(R.id.terulet);

        kerulet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(KeruletTerulet.this, Final.class);

                int a = Integer.parseInt(aoldal.getText().toString());
                int b = Integer.parseInt(boldal.getText().toString());
                i.putExtra("eredmeny", 2*(a+b));

                startActivity(i);
            }
        });

        terulet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(KeruletTerulet.this, Final.class);

                int a = Integer.parseInt(aoldal.getText().toString());
                int b = Integer.parseInt(boldal.getText().toString());
                i.putExtra("eredmeny", a*b);

                startActivity(i);
            }
        });
    }
}
