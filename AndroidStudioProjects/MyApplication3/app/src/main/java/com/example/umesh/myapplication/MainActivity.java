package com.example.umesh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private CheckBox check1, check2, check3;
    private Button button_sel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
        addListenerToCheckBox1();
        addListenerToCheckBox2();
    }
    public void addListenerToCheckBox() {
        check1 = (CheckBox) findViewById(R.id.checkBox_kutta);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "kutta is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
    public void addListenerToCheckBox1() {
        check1 = (CheckBox) findViewById(R.id.checkBox2_billy);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "billy is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
    public void addListenerToCheckBox2() {
        check1 = (CheckBox) findViewById(R.id.checkBox_chooha);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this, "chooha is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
    public void addListenerOnButton() {
        check1 = (CheckBox) findViewById(R.id.checkBox_kutta);
        check2 = (CheckBox) findViewById(R.id.checkBox2_billy);
        check3 = (CheckBox) findViewById(R.id.checkBox_chooha);
        button_sel = (Button) findViewById(R.id.button);

        button_sel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuffer result = new StringBuffer();
                        result.append("kutta : ").append(check1.isChecked());
                        result.append("\nbilly : ").append(check2.isChecked());
                        result.append("\nchooha : ").append(check3.isChecked());
                        Toast.makeText(MainActivity.this, result.toString(),
                                Toast.LENGTH_LONG).show();

                    }


                }
        );

    }
}
