package com.example.umesh.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login_btn;
    int attempt_counter =5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();
    }
    public void LoginButton(){
        username = (EditText)findViewById(R.id.editText_name);
        password = (EditText)findViewById(R.id.editText2_password);
        attempts = (TextView) findViewById(R.id.textView5_attempts);
        login_btn = (Button) findViewById(R.id.button_login);

        attempts.setText(Integer.toString(attempt_counter));

        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("umesh")&&
                                password.getText().toString().equals("kirandevi")) {
                            Toast.makeText(MainActivity.this, "User name and password is correct", Toast.LENGTH_SHORT).show();
                            Intent intent  = new Intent("com.example.umesh.myapplication.user");
                            startActivity(intent);


                        }
                        else{
                            Toast.makeText(MainActivity.this, "User name and password is not correct", Toast.LENGTH_SHORT).show();
                            attempt_counter--;
                            attempts.setText(Integer.toString(attempt_counter));
                            if(attempt_counter == 0){
                                login_btn.setEnabled(false);
                            }

                        }
                    }
                }
        );
    }
}
