package com.firebaseloginapp.AccountActivity.EngineeringCourse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebaseloginapp.R;

public class ComputerEngineering1 extends AppCompatActivity {

    TextView t31, t32, t33;
    EditText e31,e32;
    Button nextpage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_engineering1);
        t31 = (TextView)findViewById(R.id.textView31);
        t32 = (TextView)findViewById(R.id.textView32);
        t33 = (TextView)findViewById(R.id.textView33);

        e31 = (EditText)findViewById(R.id.editText31);
        e32 = (EditText)findViewById(R.id.editText32);

        nextpage2 = (Button)findViewById(R.id.button33);

        nextpage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(e31.getText().toString());
                int num2 = Integer.parseInt(e32.getText().toString());

                if((num1<=4500)&&(num2>=1))
                {
                    Intent intent = new Intent(ComputerEngineering1.this, ComputerEngineering11.class);
                    startActivity(intent);
                }
                else if((num1>4500&&num1<=10135)&&(num2 == 1))
                {
                    Intent intent = new Intent(ComputerEngineering1.this, ComputerEngineering12.class);
                    startActivity(intent);
                }
                else if((num1>4500&&num1<=10135)&&(num2>=2))
                {
                    Intent intent = new Intent(ComputerEngineering1.this,ComputerEngineering12.class );
                    startActivity(intent);
                }
                else if((num1>4500&&num1<=6350)&& (num2 == 3))
                {
                    Intent intent = new Intent(ComputerEngineering1.this, ComputerEngineering13.class);
                    startActivity(intent);
                }
                else if( (num1>10135&&num1<=40000)&&(num2 >=3))
                {
                    Intent intent = new Intent(ComputerEngineering1.this, ComputerEngineering14.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(ComputerEngineering1.this, "Please Enter rank from 1 to 40000 for jac Admission", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
