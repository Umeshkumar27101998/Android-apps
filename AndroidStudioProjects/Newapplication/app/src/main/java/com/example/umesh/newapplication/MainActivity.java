package com.example.umesh.newapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView tView;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void onButtonCLick(View v) {

        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView tView = (TextView) findViewById(R.id.textView2);


            int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());

        int sum = n1 + n2;
        tView.setText(Integer.toString(sum));

        }

}
