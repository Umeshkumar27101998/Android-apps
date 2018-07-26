package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering11 extends Activity {
        TextView t35;
    boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering11);
        t35 = (TextView)findViewById(R.id.textView35);


    }
    @Override
    public void onBackPressed()
    {
        Toast.makeText(ComputerEngineering11.this,"press again to exit", Toast.LENGTH_SHORT).show();
        if(exit == true)
        {
            finish();
        }
        exit = true;

    }
}
