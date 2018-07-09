package com.example.umesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tview;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        onButtonClick(view);
    }
});
    }

    public void onButtonClick(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.editText1);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView tview = (TextView) findViewById(R.id.textView);

        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());

        int sum = n1+n2;
        tview.setText(Integer.toString(sum));
    }

}
