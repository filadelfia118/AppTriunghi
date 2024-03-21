package com.example.apptriunghi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity{
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);

        textViewResult.setText(String.valueOf(result));
    }
}
