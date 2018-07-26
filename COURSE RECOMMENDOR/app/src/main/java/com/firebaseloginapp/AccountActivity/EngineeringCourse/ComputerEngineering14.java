package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering14 extends AppCompatActivity {
    TextView t38;
    Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering14);

        t38 = (TextView) findViewById(R.id.textView38);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(ComputerEngineering14.this, "press again to exit", Toast.LENGTH_SHORT).show();
        if (exit == true) {
            finish();
        }
        exit = true;

    }
}