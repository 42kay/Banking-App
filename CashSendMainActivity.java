package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CashSendMainActivity extends AppCompatActivity {

    TextView eMe;
    TextView eMom;
    TextView eMosima;
    TextView eNew;
    TextView eBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_send_main);


        eMe=findViewById(R.id.eMe);
        eMom=findViewById(R.id.eMom);
        eMosima=findViewById(R.id.eMosima);
        eNew=findViewById(R.id.eNew);
        eBack=findViewById(R.id.eBack);


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
        eBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendMainActivity.this,CashSendExist.class));

            }
        });
    }


}