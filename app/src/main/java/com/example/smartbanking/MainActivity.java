package com.example.smartbanking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWallet;
    private Button mContinue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mWallet = findViewById(R.id.EditText);
        mContinue = findViewById(R.id.buttonCon);

        mContinue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             startActivity(new Intent(getApplicationContext(),Welcome.class));
           }
       });

    }
}