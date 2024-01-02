package com.example.rolandscarrent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFerrari, editTextFord,editTextMercedez;
    private TextView textViewResult;
private Button buttons;
private Button buttonSubmit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = findViewById(R.id.buttonHome);

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, frontPage.class);
                startActivity(intent);
            }
        });
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Submit.class);
                startActivity(intent);
            }
        });

        editTextFerrari = findViewById(R.id.editTextFerrari);
        editTextFord = findViewById(R.id.editTextFord);
        editTextMercedez = findViewById(R.id.editTextMercedez);
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateResult();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void calculateResult() {

        String input1 = editTextFerrari.getText().toString();
        String input2 = editTextFord.getText().toString();
        String input3 = editTextMercedez.getText().toString();




        if (!input1.isEmpty() && !input2.isEmpty() && !input3.isEmpty())
        {
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            int number3 = Integer.parseInt(input3);

            int result = (number1*3000) + (number2*2500) + (number3*3000);
            textViewResult.setText("Total payment : PHP " + result);
        } else if (!input1.isEmpty() && input2.isEmpty() && input3.isEmpty()) {
            int number1 = Integer.parseInt(input1);


            int result = (number1*3000) ;
            textViewResult.setText("Total payment : PHP " + result);

        }
        else if (input1.isEmpty() && !input2.isEmpty() && input3.isEmpty()) {

            int number2 = Integer.parseInt(input2);


            int result =  (number2*2500) ;
            textViewResult.setText("Total payment : PHP " + result);

        }
        else if (input1.isEmpty() && input2.isEmpty() && !input3.isEmpty()) {

            int number3 = Integer.parseInt(input3);

            int result =  (number3*3000) ;
            textViewResult.setText("Total payment : PHP " + result);

        }
        else if (input1.isEmpty() && !input2.isEmpty() && !input3.isEmpty())
        {
            int number2 = Integer.parseInt(input2);
            int number3 = Integer.parseInt(input3);

            int result =  (number2*2500) + (number3*3000);
            textViewResult.setText("Total payment : PHP " + result);
        }
        else if (!input1.isEmpty() && input2.isEmpty() && !input3.isEmpty())
        {
            int number1 = Integer.parseInt(input1);
            int number3 = Integer.parseInt(input3);
            int result = (number1*3000) +(number3*3000);
            textViewResult.setText("Total payment : PHP " + result);
        }
        else if (!input1.isEmpty() && !input2.isEmpty() && input3.isEmpty())
        {
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            int result = (number1*3000) + (number2*2500);
            textViewResult.setText("Total payment : PHP " + result);
        }

        else {
            editTextFerrari.setText("0");
            editTextFord.setText("0");
            editTextMercedez.setText("0");
        }




    }





}