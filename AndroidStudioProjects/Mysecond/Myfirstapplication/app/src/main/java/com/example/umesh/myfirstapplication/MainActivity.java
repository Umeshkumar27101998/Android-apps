package com.example.umesh.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button NAME, AGE, GENDER;
    TextView disp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NAME = (Button) findViewById(R.id.bname);
        AGE = (Button) findViewById(R.id.bage);
        GENDER = (Button) findViewById(R.id.bgender);

        disp = (TextView) findViewById(R.id.display);

        NAME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("UMESH KUMAR NIMESH");
            }

        });
        AGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("20");
            }
        });
        GENDER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("MALE");
            }
        });
    }
}
