package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPasswordActivity2 extends AppCompatActivity {
    TextView Create;

    private EditText Username,Password,ConfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password2);


        Username = findViewById(R.id.inputUserName2);
        Password = findViewById(R.id.inputPassword2);
        ConfirmPassword = findViewById(R.id.inputConfirmPassword2);

        Create=findViewById(R.id.btnCreate);

        Create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPasswordActivity2.this, MainActivity.class));
                checkCredentials();


            }
        });
    }
    private void checkCredentials() {

        String username=Username.getText().toString();
        String password=Password.getText().toString();
        String confirmPassword=ConfirmPassword.getText().toString();

        if(username.isEmpty()  ||  username.length()<7)
        {
            showError(Username,"Your username is not valid!");

        }

        else if (password.isEmpty() || password.length()<8) {
            showError(Password, "Must contain 8 characters!");
        }
        else if (confirmPassword.isEmpty() || confirmPassword.equals(password))
        {
            showError(ConfirmPassword,"Password does not match!");

        }
        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText( ForgotPasswordActivity2.this , "SignUp successful!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();
    }
}