package com.example.vikram.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vikram.googlemaps.Task1.MapsActivity;
import com.example.vikram.googlemaps.Task2.Task2MapsActivity;
import com.example.vikram.googlemaps.Task3.Task3MapsActivity;

public class MainActivity extends AppCompatActivity {

    Button task1,task2,task3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        task1 = (Button)findViewById(R.id.task1);
        task2 = (Button)findViewById(R.id.task2);
        task3 = (Button)findViewById(R.id.task3);

        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Task2MapsActivity.class);
                startActivity(i);
            }
        });

        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Task3MapsActivity.class);
                startActivity(i);
            }
        });


    }
}
