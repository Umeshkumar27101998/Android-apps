package com.example.umesh.myapplication;

import android.support.v7.app.AppCompatActivity;
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

    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editText2);
        EditText e2 = (EditText) findViewById(R.id.editText3);
        TextView t1 = (TextView) findViewById(R.id.editText5);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }
}