package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering13 extends AppCompatActivity {
    TextView t37;
    Boolean exit = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering13);

        t37 = (TextView)findViewById(R.id.textView37);

    }
    @Override
    public void onBackPressed()
    {
        Toast.makeText(ComputerEngineering13.this,"press again to exit", Toast.LENGTH_SHORT).show();
        if(exit == true)
        {
            finish();
        }
        exit = true;

    }
}
