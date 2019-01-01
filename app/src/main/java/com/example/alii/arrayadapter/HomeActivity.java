package com.example.alii.arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        data=findViewById(R.id.data);

        //to receive intent
        Intent intent =getIntent();
        String value = intent.getStringExtra("keyname");
        data.setText(value );


    }
}
