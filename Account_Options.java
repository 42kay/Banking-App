package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account_Options extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_options);

        button1 = findViewById(R.id.TransactionHistory);
        button2 = findViewById(R.id.AccountOptions);
        button3 = findViewById(R.id.Transfer);
        button4 = findViewById(R.id.Pay_someone);
        button5 = findViewById(R.id.Buy_electricity);
        button6 = findViewById(R.id.Statement_history);
        button7 = findViewById(R.id.Buy_airtime);
        button8 = findViewById(R.id.Cash_send);
        button9 = findViewById(R.id.Debit_order);
        button10 = findViewById(R.id.back1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Savings_Account.class);
                startActivity(intent);
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Cheque_Account.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Transfer.class);
                startActivity(intent);
            }
        });



        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Pay_Someone.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Buy_Electricity.class);
                startActivity(intent);
            }
        });



        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Statement_History.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Buy_Airtime.class);
                startActivity(intent);
            }
        });



        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Cash_Send.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Debit_Order.class);
                startActivity(intent);
            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Account_Options.this, Savings_Account.class);
                startActivity(intent);
            }
        });

    }
}