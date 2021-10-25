package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {



   TextView eSignUp;
    TextView AlreadyHaveAccount;






    private EditText inputAccountNumber,inputUsername,inputPassword,inputConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        inputAccountNumber=findViewById(R.id.inputAccountNumber);
        inputUsername = findViewById(R.id.inputUserName);
        inputPassword=findViewById(R.id.inputPassword);
        inputConfirmPassword=findViewById(R.id.inputConfirmPassword);

        eSignUp=findViewById(R.id.btnSignUp);
        AlreadyHaveAccount=findViewById(R.id.AlreadyHaveAccount);


//        checkCredentials();


        eSignUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                checkCredentials();


            }
        });
        AlreadyHaveAccount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this,MainActivity.class));

            }
        });



    }

    private void checkCredentials() {
        String accountNumber=inputAccountNumber.getText().toString();
        String username=inputUsername.getText().toString();
        String password=inputPassword.getText().toString();
        String confirmPassword=inputConfirmPassword.getText().toString();

        if(username.isEmpty()  ||  username.length()<7)
        {
            showError(inputUsername,"Your username is not valid!");

        }
        else if (accountNumber.isEmpty()|| accountNumber.length()<10)
        {
            showError(inputAccountNumber,"Account Number is not valid!");
        }
        else if (password.isEmpty() || password.length()<8) {
            showError(inputPassword, "Must contain 8 characters!");
        }
        else if (confirmPassword.isEmpty() || confirmPassword.equals(password))
        {
            showError(inputConfirmPassword,"Password does not match!");
            
        }
        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( SignUpActivity.this , "SignUp successful!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {
        
        input.setError(s);
        input.requestFocus();
    }
}