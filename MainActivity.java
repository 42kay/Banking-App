 package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private  EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;

    private final String Username="Admin";
     private  final String Password="12345678";

     boolean isValid =false;

     private int counter =5;
     TextView CreateNewAccount;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName= findViewById(R.id.etName);
        ePassword=findViewById(R.id.etPassword);
        eLogin=findViewById(R.id.btnLogin);
        eAttemptsInfo=findViewById(R.id.tvAttemptsinfo);
        CreateNewAccount=findViewById(R.id.CreateNewAccount);

        CreateNewAccount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));

            }
        });

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String inputName=eName.getText().toString();
                String inputPassword=ePassword.getText().toString();

                if(inputName.isEmpty()|| inputPassword.isEmpty())
                {
                            Toast.makeText( MainActivity.this , "Please enter all the details correctly!",Toast.LENGTH_SHORT).show();
            }else{
                    isValid =validate(inputName,inputPassword);
                    if(!isValid){
                        counter--;
                        Toast.makeText( MainActivity.this , "Incorrect credentials entered!",Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("No. of attempts remaining: " + counter);

                        if(counter ==0) {
                            eLogin.setEnabled(false);
                        }

                    }else{
                        Toast.makeText( MainActivity.this , "Login successful!",Toast.LENGTH_SHORT).show();
                        //Add the code to go to new Activity
                        Intent intent= new Intent(MainActivity.this,HomePageActivity.class);
                        startActivity(intent);
                    }



                }

            }
        });
    }

    private boolean validate(String name,String password){

        if (name.equals(Username) && password.equals(Password)) {
            return true;
        }
        return false;
    }
}