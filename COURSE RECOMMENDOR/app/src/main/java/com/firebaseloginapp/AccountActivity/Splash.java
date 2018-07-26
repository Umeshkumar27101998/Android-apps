package com.firebaseloginapp.AccountActivity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.firebaseloginapp.R;

public class Splash extends AppCompatActivity {
    private ImageView iv;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv =  (ImageView)findViewById(R.id.imageView);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.animation);
        iv.startAnimation(myanim);

        progressBar.setVisibility(View.VISIBLE);
        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },  3000);
    }
}
