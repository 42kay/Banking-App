package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CashSendActivity extends AppCompatActivity {

    TextView eSend;
    TextView Back;
    private EditText inputCell,inputname,inputPin,inputMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_send);

        inputname =findViewById(R.id.etRname);
        inputCell = findViewById(R.id.etCell);
        inputMoney=findViewById(R.id.etMoney);
        inputPin=findViewById(R.id.etPin);

        eSend=findViewById(R.id.btnSend);
        Back=findViewById(R.id.Back);

       Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendActivity.this,CashSendMainActivity.class));

            }
        });


//        checkCredentials();


        eSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(CashSendActivity.this, MainActivity.class));
                checkCredentials();


            }
        });



    }

    private void checkCredentials() {
        String name=inputname.getText().toString();
        String cell=inputCell.getText().toString();
        String money=inputMoney.getText().toString();
        String pin=inputPin.getText().toString();

        if(name.isEmpty()  ||  name.length()<7)
        {
            showError(inputname,"Your username is not valid!");

        }
        else if (cell.isEmpty()|| cell.length()<=10)
        {
            showError(inputCell,"Cellphone Number must contain 10 digits!");
        }
        else if (money.isEmpty() ) {
            showError(inputMoney, "Please Add and amount!");
        }
        else if (pin.isEmpty() || pin.length()<=5)
        {
            showError(inputPin,"Must contain 5 digits!");

        }
        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( CashSendActivity.this , "Cash Send successful!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }
}

