package com.firebaseloginapp.AccountActivity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.firebaseloginapp.R;

public class Main2Activity extends AppCompatActivity {

    TextView t1, t2, t3;
    Button b1, b2,b3,b4,b5,b6,b7,b8,b9,b10;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView)findViewById(R.id.textView20);
        t2 = (TextView)findViewById(R.id.textView21);
        t3 = (TextView)findViewById(R.id.textView22);

        b1 = (Button)findViewById(R.id.button20);
        b2 = (Button)findViewById(R.id.button21);
        b3 = (Button)findViewById(R.id.button22);
        b4 = (Button)findViewById(R.id.button23);
        b5 = (Button)findViewById(R.id.button24);
        b6 = (Button)findViewById(R.id.button25);
        b7 = (Button)findViewById(R.id.button26);
        b8 = (Button)findViewById(R.id.button27);
        b9 = (Button)findViewById(R.id.button28);
        b10 = (Button)findViewById(R.id.button29);

        progressBar = (ProgressBar)findViewById(R.id.progressBar20);
        progressBar.setVisibility(View.GONE);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, EngineeringActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, MedicalActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, BachelorActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, DiplomaActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, PharmacyActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, BusinessActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, MediaActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, MasterActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, DoctorActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                Handler hd = new Handler();
                hd.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                        progressBar.setVisibility(View.GONE);
                    }
                },2000);

            }
        });



    }
}
