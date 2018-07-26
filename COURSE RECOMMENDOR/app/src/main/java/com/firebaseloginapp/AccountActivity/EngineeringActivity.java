package com.firebaseloginapp.AccountActivity;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.AccountActivity.EngineeringCourse.Aeronautical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Agricultural;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.BioChemical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Chemical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Civil;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.ComputerEngineering;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Electrical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.ElectricalandInstrumentation;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.ElectronicsandCommunication;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.InformationTechnology;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Mechanical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Metallurgical;
import com.firebaseloginapp.AccountActivity.EngineeringCourse.Mining;
import com.firebaseloginapp.R;

public class EngineeringActivity extends AppCompatActivity {
    TextView t25;
    EditText e20;
    CheckBox checkBox;
    Button b30, b31;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);

        t25 = (TextView) findViewById(R.id.textView25);
        e20 = (EditText) findViewById(R.id.editText20);
        checkBox = (CheckBox) findViewById(R.id.checkBox1);
        b30 = (Button) findViewById(R.id.button30);
        b31 = (Button)findViewById(R.id.button31);


                // Intent intent = new Intent(EngineeringActivity.this, ComputerEngineering.class);
                //startActivity(intent);

              /*  else if((Branch == "Electronics and Communication")||(Branch == "electronincs and communication"))
                {
                    Intent intent = new Intent(EngineeringActivity)
                }*/



                    checkBox.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        if (((CheckBox) view).isChecked()) {
                                                            Toast.makeText(EngineeringActivity.this, "You are agreed with terms and Condition", Toast.LENGTH_SHORT).show();
                                                        } else {
                                                            Toast.makeText(EngineeringActivity.this, "Please do Check on Checkbox ", Toast.LENGTH_SHORT).show();
                                                            return;
                                                        }
                                                    }
                    });


                                                        b30.setOnClickListener(new View.OnClickListener()

                                                        {
                                                            @Override
                                                            public void onClick(View view) {
                                                                int v = Integer.parseInt(e20.getText().toString());
                                                                if (v == 1) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, ComputerEngineering.class);
                                                                    startActivity(intent);
                                                                } else if (v == 2) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, ElectronicsandCommunication.class);
                                                                    startActivity(intent);
                                                                } else if (v == 3) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Electrical.class);
                                                                    startActivity(intent);
                                                                } else if (v == 4) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Mechanical.class);
                                                                    startActivity(intent);
                                                                } else if (v == 5) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, InformationTechnology.class);
                                                                    startActivity(intent);
                                                                } else if (v == 6) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Civil.class);
                                                                    startActivity(intent);
                                                                } else if (v == 7) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Chemical.class);
                                                                    startActivity(intent);
                                                                } else if (v == 8) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Aeronautical.class);
                                                                    startActivity(intent);
                                                                } else if (v == 9) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Agricultural.class);
                                                                    startActivity(intent);
                                                                } else if (v == 10) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Mining.class);
                                                                    startActivity(intent);
                                                                } else if (v == 11) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, BioChemical.class);
                                                                    startActivity(intent);
                                                                } else if (v == 12) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, ElectricalandInstrumentation.class);
                                                                    startActivity(intent);
                                                                } else if (v == 13) {
                                                                    Intent intent = new Intent(EngineeringActivity.this, Metallurgical.class);
                                                                    startActivity(intent);
                                                                } else {
                                                                    Toast.makeText(EngineeringActivity.this, "Please enter number from 1 to 13 only", Toast.LENGTH_SHORT).show();
                                                                }
                                                            }
                                                        });

                    b31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(EngineeringActivity.this, BranchCode.class);
                            startActivity(intent);
                        }
                    });

        }
    }

