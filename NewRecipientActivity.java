package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewRecipientActivity extends AppCompatActivity {
    TextView btnBuy2;
    TextView etvBack2;
    private EditText inputNo,inputRName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_recipient);

        inputRName=findViewById(R.id.evRname);
        inputNo=findViewById(R.id.evCell);

        btnBuy2=findViewById(R.id.btnBuy2);
        etvBack2=findViewById(R.id.etvBack2);

        etvBack2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewRecipientActivity.this,BuyAirtimeMainActivity.class));

            }
        });

        btnBuy2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewRecipientActivity.this, BuyAirtimeExistingActivity2.class));
                checkCredentials();


            }
        });



    }

    private void checkCredentials() {

        String cell=inputNo.getText().toString();
        String name=inputRName.getText().toString();



        if (cell.isEmpty() || cell.length()<=10)
        {
            showError(inputNo,"Must contain 10 digits!");

        }
        else if (name.isEmpty() )
        {
            showError(inputRName,"Please insert recipient name!");

        }
        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( NewRecipientActivity.this , "Added successfully!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }
}

