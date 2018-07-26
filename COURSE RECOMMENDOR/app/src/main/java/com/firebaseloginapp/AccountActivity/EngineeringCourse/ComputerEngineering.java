package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering extends AppCompatActivity {

    TextView t26, t27,t28,t29;
    TextInputEditText e30,e31;
    Button nextpage;
   // CheckBox checkBox1,checkBox2,checkBox3, checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computerengineering);

        t26 = (TextView)findViewById(R.id.textView26);
        t27 = (TextView)findViewById(R.id.textView27);
        t28 = (TextView)findViewById(R.id.textView28);
        t29 = (TextView)findViewById(R.id.textView29);
        //t30 = (TextView)findViewById(R.id.textView30);

        e30 = (TextInputEditText)findViewById(R.id.textinputedittext30);
        e31 = (TextInputEditText)findViewById(R.id.textinputedittext31);

        /*checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);*/


        nextpage = (Button)findViewById(R.id.button32);
        /*checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked())
                {
                    Toast.makeText(ComputerEngineering.this, "Category : GENERAL", Toast.LENGTH_SHORT).show();
                }

            }

        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked())
                {
                    Toast.makeText(ComputerEngineering.this, "Category : OBC", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked())
                {
                    Toast.makeText(ComputerEngineering.this, "Category : SC", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)view).isChecked())
                {
                    Toast.makeText(ComputerEngineering.this, "Category : ST", Toast.LENGTH_SHORT).show();
                }
            }
        });
*/
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String next1 = e30.getText().toString();
                String next2 = e31.getText().toString();
                char page1 = next1.charAt(0);
                char page2 = next2.charAt(0);
                if(page1 == 'y'||page1 == 'Y')
                {
                    if(page2 == 'y'||page2 == 'Y')
                    {
                        Intent intent1 = new Intent(ComputerEngineering.this, ComputerEngineering1.class);
                        startActivity(intent1);
                    }
                    else{
                        Intent intent2 = new Intent(ComputerEngineering.this, ComputerEngineering2.class);
                        startActivity(intent2);
                    }
                }
                else
                {
                    return;
                }

            }
        });
    }
}
