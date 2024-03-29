package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double sum = num1 + num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + sum);
    }

    public void subt(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double diff = num1 - num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + diff);
    }

    public void mult(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double product = num1 * num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + product);
    }

    public void div(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());

        // add the two ints
        double output = num1 / num2;

        // set the text for the answer
        ansTextView.setText("Answer: " + output);
    }

    public void clear(View v) {
        // Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);


        // set the text for the all
        ansTextView.setText("Answer: ");
        num1EditText.setText("");
        num2EditText.setText("");
    }
}