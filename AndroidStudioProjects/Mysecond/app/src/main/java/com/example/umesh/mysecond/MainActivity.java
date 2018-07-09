package com.example.umesh.mysecond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ADD, SUB, RESET;
    int count =0;
    TextView disp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ADD = (Button) findViewById(R.id.bname);
        SUB = (Button) findViewById(R.id.bage);
        RESET = (Button) findViewById(R.id.bgender);

        disp = (TextView) findViewById(R.id.display);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               count = count+1;
                disp.setText(count);
            }

        });
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count-1;
                disp.setText(count);
            }
        });
        RESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                disp.setText(count);
            }
        });
    }
}
