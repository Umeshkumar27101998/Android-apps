package com.firebaseloginapp.AccountActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebaseloginapp.R;

public class BranchCode extends AppCompatActivity {
    TextView t30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_code);

        t30 = (TextView)findViewById(R.id.textView30);
    }
}
