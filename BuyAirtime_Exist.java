package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuyAirtime_Exist extends AppCompatActivity {


    TextView btnBuy3;
    TextView rnBack;
    private EditText inputAmount3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime_exist);

        btnBuy3=findViewById(R.id.btnBuy3);
        rnBack=findViewById(R.id.rnBack);

        inputAmount3=findViewById(R.id.inputAmount3);


        rnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyAirtime_Exist.this,MainActivity.class));

            }
        });

        btnBuy3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyAirtime_Exist.this, MainActivity.class));
                checkCredentials();


            }
        });



    }

    private void checkCredentials() {

        String amount=inputAmount3.getText().toString();




        if (amount.isEmpty() )
        {
            showError(inputAmount3,"Please enter an amount!");

        }

        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( BuyAirtime_Exist.this , "Purchase successfully!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }
}


