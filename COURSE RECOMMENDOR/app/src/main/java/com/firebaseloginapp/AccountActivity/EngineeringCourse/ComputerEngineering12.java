package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering12 extends AppCompatActivity {
TextView t36;
Boolean exit = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering12);

        t36 = (TextView)findViewById(R.id.textView36);

    }
    @Override
    public void onBackPressed()
    {
        Toast.makeText(ComputerEngineering12.this,"press again to exit", Toast.LENGTH_SHORT).show();
        if(exit == true)
        {
            finish();
        }
        exit = true;

    }
}
