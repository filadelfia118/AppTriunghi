package com.example.apptriunghi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextSide1, editTextSide2;
    Button buttonCalculateArea, buttonCalculatePerimeter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSide1 = findViewById(R.id.editTextSide1);
        editTextSide2 = findViewById(R.id.editTextSide2);
        buttonCalculateArea = findViewById(R.id.buttonCalculateArea);
        buttonCalculatePerimeter = findViewById(R.id.buttonCalculatePerimeter);

        buttonCalculateArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateArea();
            }
        });

        buttonCalculatePerimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatePerimeter();
            }
        });
    }
    private void calculateArea() {

        double side1 = Double.parseDouble(editTextSide1.getText().toString());
        double side2 = Double.parseDouble(editTextSide2.getText().toString());
        double area = 0.5 * side1 * side2;
        displayResult(area);
    }

    private void calculatePerimeter() {

        double side1 = Double.parseDouble(editTextSide1.getText().toString());
        double side2 = Double.parseDouble(editTextSide2.getText().toString());
        double perimeter = side1 + side2 + Math.sqrt(side1 * side1 + side2 * side2);
        displayResult(perimeter);
    }

    private void displayResult(double result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}