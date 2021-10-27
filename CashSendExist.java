package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CashSendExist extends AppCompatActivity {

    TextView eSend;
    private EditText inputCode,inputRand;
    TextView etBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_send_exist);

        inputCode=findViewById(R.id.etRand);
        inputRand = findViewById(R.id.etCode);


        eSend=findViewById(R.id.btnSend3);

        etBack=findViewById(R.id.etBack);

        etBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendExist.this,CashSendMainActivity.class));

            }
        });

//        checkCredentials();


        eSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendExist.this, CashSendMainActivity.class));
                checkCredentials();


            }
        });



    }

    private void checkCredentials() {
        String rand=inputRand.getText().toString();
        String code=inputCode.getText().toString();


        if(rand.isEmpty()  ||  rand.length()<7)
        {
            showError(inputRand,"Please insert an amount!");

        }

        else if (code.isEmpty() || code.length()<=5)
        {
            showError(inputCode,"Must contain 5 digits!");

        }
        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( CashSendExist.this , "Cash Send successful!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }
}

