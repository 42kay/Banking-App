package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class BuyAirtimeExistingActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView btnBuy;

    private EditText inputAmount2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime_existing2);
        btnBuy=findViewById(R.id.btnBuy);
        inputAmount2=findViewById(R.id.etRand2);




        Spinner spinner= findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.network,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text,Toast.LENGTH_SHORT);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    btnBuy.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            startActivity(new Intent(BuyAirtimeExistingActivity2.this, MainActivity.class));
            checkCredentials();


        }
    };





    private void checkCredentials() {
        String rand2=inputAmount2.getText().toString();



        if(rand2.isEmpty() )
        {
            showError(inputAmount2,"Please insert an amount!");

        }

        else{
//            Toast.makeText(context: this ,text:"Call SignUp Method", Toast.LENGTH_SHORT).show();
            Toast.makeText(BuyAirtimeExistingActivity2.this , "Purchase successful!",Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }
}



