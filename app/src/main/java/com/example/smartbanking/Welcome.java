package com.example.smartbanking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {
    EditText mSearch;
    EditText mContacts;
    EditText mTrending;
    EditText mNearby;
    EditText mSmart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mSearch = findViewById(R.id.EditText);
        mContacts = findViewById(R.id.EditText);
        mTrending= findViewById(R.id.EditText);
        mNearby = findViewById(R.id.EditText);
        mSmart = findViewById(R.id.EditText);
    }
}