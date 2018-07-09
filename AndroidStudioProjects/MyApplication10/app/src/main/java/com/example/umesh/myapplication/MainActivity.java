package com.example.umesh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {
private static Button button_sbm;
    private static TextClock digital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnButtonClickListener() {
        button_sbm = (Button)findViewById(R.id.button);
        digital = (TextClock)findViewById(R.id.textClock);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(digital.getVisibility() == TextClock.GONE) {
                            digital.setVisibility(TextClock.VISIBLE);
                        } else{
                            digital.setVisibility(TextClock.GONE);

                        }
                    }
                }
        );
    }
}
