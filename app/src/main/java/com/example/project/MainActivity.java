package com.example.project;

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

        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        Button first = findViewById(R.id.button);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });

        Intent n = new Intent(MainActivity.this,MainActivity3.class);

        Button second = findViewById(R.id.button2);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(n);
            }
        });

        Intent m = new Intent(MainActivity.this,MainActivity4.class);

        Button third = findViewById(R.id.button8);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(m);
            }
        });

        Intent c = new Intent(MainActivity.this,MainActivity5.class);

        Button fourth = findViewById(R.id.button4);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(c);
            }
        });
    }
}