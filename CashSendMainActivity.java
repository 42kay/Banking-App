package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CashSendMainActivity extends AppCompatActivity {

    private Button eMe;
    private Button eMom;
    private Button eMosima;
    private Button eNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_send_main);


        eMe=findViewById(R.id.eMe);
        eMom=findViewById(R.id.eMom);
        eMosima=findViewById(R.id.eMosima);
        eNew=findViewById(R.id.eNew);


        eMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendMainActivity.this,CashSendExist.class));

            }
        });
        eMom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendMainActivity.this,CashSendExist.class));

            }
        });
        eMosima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendMainActivity.this,CashSendExist.class));

            }
        });
        eNew.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendMainActivity.this,CashSendActivity.class));

            }
        });
    }


}