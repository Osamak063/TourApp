package com.example.osamakhalid.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        TextView language=(TextView) findViewById(R.id.lang);
        TextView dress=(TextView) findViewById(R.id.dress);
        TextView restaurants=(TextView) findViewById(R.id.res);
        TextView famous=(TextView) findViewById(R.id.famous);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this,Language.class);
                startActivity(intent);
            }
        });
        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this,Dress.class);
                startActivity(intent);
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this,Restaurants.class);
                startActivity(intent);
            }
        });
        famous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this,Famous.class);
                startActivity(intent);
            }
        });

    }
}
