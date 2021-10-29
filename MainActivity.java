package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView eMe;
    TextView eMom;
    TextView eMosima;
    TextView eNew;
    TextView eBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eMe=findViewById(R.id.eMe);
        eMom=findViewById(R.id.eMom);
        eMosima=findViewById(R.id.eMosima);
        eNew=findViewById(R.id.eNew);
        eBack=findViewById(R.id.eBack);


        eMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BuyAirtime_Exist.class));

            }
        });
        eMom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BuyAirtime_Exist.class));

            }
        });
        eMosima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BuyAirtime_Exist.class));

            }
        });
        eNew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NewRecipientActivity.class));

            }
        });
        eBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BuyAirtime_Exist.class));

            }
        });
    }
}