package com.example.umesh.mysecond;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    public int TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(Splash.this,MainActivity.class);
               startActivity(i);
               finish();
           }
       }, TIME_OUT);

    }
}
