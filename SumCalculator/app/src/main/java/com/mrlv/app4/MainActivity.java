package com.mrlv.app4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText editText1, editText2;
    Button buttonAdd,buttonSub, buttonMul, buttonDiv, buttonReset;
    TextView testResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);;
        editText2 = findViewById(R.id.editText2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDivision);
        buttonReset = findViewById(R.id.buttonReset);
        testResult = findViewById(R.id.testResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    double sum = Double.parseDouble(num1) + Double.parseDouble(num2);
                    testResult.setText("Result: " + sum);
                } else {
                    testResult.setText("Please Enter Valid Numbers...");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    double sub = Double.parseDouble(num1) - Double.parseDouble(num2);
                    testResult.setText("Result: " + sub);
                } else {
                    testResult.setText("Please Enter Valid Numbers...");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    double mul = Double.parseDouble(num1) * Double.parseDouble(num2);
                    testResult.setText("Result: " + mul);
                } else {
                    testResult.setText("Please Enter Valid Numbers...");
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();

                if (Integer.parseInt(num2) == 0){
                    testResult.setText("Cannot be dividied by zero...");
                } else if(!num1.isEmpty() && !num2.isEmpty()) {
                    double div = Double.parseDouble(num1) / Double.parseDouble(num2);
                    testResult.setText("Result: " + div);
                } else {
                    testResult.setText("Please Enter Valid Numbers...");
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v){
                    editText1.setText("");
                    editText2.setText("");
                    testResult.setText("");
                }
        });
    }
}