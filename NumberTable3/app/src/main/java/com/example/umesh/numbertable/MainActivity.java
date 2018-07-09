package com.example.umesh.numbertable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
String one[] = {"1*1 = 1","1*2 = 2","1*3 = 3","1*4 = 4","1*5 = 5","1*6 = 6","1*7 = 7","1*8 = 8","1*9 = 9","1*10 = 10"};
String two[] = {"2*1 = 2","2*2 = 4","2*3 = 6","2*4 = 8","2*5 = 10","2*6 = 12","2*7 = 14","2*8 = 16","2*9 = 18","2*10 = 20"};
String three[] = {"3*1 = 3","3*2 = 6","3*3 = 9","3*4 = 12","3*5 = 15","3*6 = 18","3*7 = 21","3*8 = 24","3*9 = 27","3*10 = 30"};
String four[] = {"4*1 = 4","4*2 = 8","4*3 = 12","4*4 = 16","4*5 = 20","4*6 = 24","4*7 = 28","4*8 = 32","4*9 = 36","4*10 = 40"};
String five[] = {"5*1 = 5","5*2 = 10","5*3 = 15","5*4 = 20","5*5 = 25","5*6 = 30","5*7 = 35","5*8 = 40","5*9 = 45","5*10 = 50"};
String six[] = {"6*1 = 6","6*2 = 12","6*3 = 18","6*4 = 24","6*5 = 30","6*6 = 36","6*7 = 42","6*8 = 48","6*9 = 54","6*10 = 60"};
String seven[] = {"7*1 = 7","7*2 = 14","7*3 = 21","7*4 = 28","7*5 = 35","7*6 = 42","7*7 = 49","7*8 = 56","7*9 = 63","7*10 = 70"};
String eight[] = {"8*1 = 8","8*2 = 16","8*3 = 24","8*4 = 32","8*5 = 40","8*6 = 48","8*7 = 56","8*8 = 64","8*9 = 72","8*10 = 80"};
String nine[] = {"9*1 = 9","9*2 = 18","9*3 = 27","9*4 = 36","*5 = 45","9*6 = 54","9*7 = 63","9*8 = 72","9*9 = 81","9*10 = 90"};
String ten[] = {"10*1 = 10","10*2 = 20","10*3 = 20","10*4 = 40","10*5 = 50","10*6 = 60","10*7 = 70","10*8 = 80","10*9 = 90","10*10 = 100"};
String eleven[] = {"11*1 = 11","11*2 = 22","11*3 = 33","11*4 = 44","11*5 = 55","11*6 = 66","11*7 = 77","11*8 = 88","11*9 = 99","11*10 = 110"};
String twelve[] = {"12*1 = 12","12*2 = 24","12*3 = 36","12*4 = 48","12*5 = 60","12*6 = 72","12*7 = 84","12*8 = 96","12*9 = 108","12*10 = 120"};
String thirteen[] = {"13*1 =13","13*2 = 26","13*3 = 39","13*4 = 52","13*5 = 65","13*6 = 78","13*7 = 91","13*8 = 104","13*9 = 117","13*10 = 130"};
String fourteen[] = {"14*1 = 14","14*2 = 28","14*3 = 42","14*4 = 56","14*5 = 70","14*6 = 84","14*7 = 98","14*8 = 112","14*9 = 126","14*10 = 140"};
String fifteen[] = {"15*1 = 15 ","15*2 = 30","15*3 = 45","15*4 = 60","15*5 = 75","15*6 = 90","15*7 = 105","15*8 = 120","15*9 = 135","15*10 = 150"};
String sixteen[] = {"16*1 = 16","16*2 = 32","16*3 = 48","16*4 = 64","16*5 = 80","16*6 = 96","16*7 = 112","16*8 = 128","16*9 = 144","16*10 = 160"};
String seventeen[] = {"17*1 = 17","17*2 = 34","17*3 = 51","17*4 = 68","17*5 = 85","17*6 = 102","17*7 = 119","17*8 = 136","17*9 = 153","17*10 = 170"};
String eighteen[] = {"18*1 = 18","18*2 = 36","18*3 = 54","18*4 = 72","18*5 = 90","18*6 = 108","18*7 = 126","18*8 = 144","18*9 = 162","18*10 = 180"};
String nineteen[] = {"19*1 = 19","19*2 = 38","19*3 = 57","19*4 = 76","19*5 = 95","19*6 = 114","19*7 = 133","19*8 = 152","19*9 = 171","19*10 = 190"};
String twenty[] = {"20*1 = 20","20*2 = 40","20*3 = 60","20*4 = 80","20*5 = 100","20*6 = 120","20*7 = 140","20*8 = 160","20*9 = 180","20*10 = 200"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b20 = (Button) findViewById(R.id.button20);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);
        t6 = (TextView) findViewById(R.id.textView6);
        t7 = (TextView) findViewById(R.id.textView7);
        t8 = (TextView) findViewById(R.id.textView8);
        t9 = (TextView) findViewById(R.id.textView9);
        t10 = (TextView) findViewById(R.id.textView10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(one[0]));
                t2.setText(String.valueOf(one[1]));
                t3.setText(String.valueOf(one[2]));
                t4.setText(String.valueOf(one[3]));
                t5.setText(String.valueOf(one[4]));
                t6.setText(String.valueOf(one[5]));
                t7.setText(String.valueOf(one[6]));
                t8.setText(String.valueOf(one[7]));
                t9.setText(String.valueOf(one[8]));
                t10.setText(String.valueOf(one[9]));

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(two[0]));
                t2.setText(String.valueOf(two[1]));
                t3.setText(String.valueOf(two[2]));
                t4.setText(String.valueOf(two[3]));
                t5.setText(String.valueOf(two[4]));
                t6.setText(String.valueOf(two[5]));
                t7.setText(String.valueOf(two[6]));
                t8.setText(String.valueOf(two[7]));
                t9.setText(String.valueOf(two[8]));
                t10.setText(String.valueOf(two[9]));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(three[0]));
                t2.setText(String.valueOf(three[1]));
                t3.setText(String.valueOf(three[2]));
                t4.setText(String.valueOf(three[3]));
                t5.setText(String.valueOf(three[4]));
                t6.setText(String.valueOf(three[5]));
                t7.setText(String.valueOf(three[6]));
                t8.setText(String.valueOf(three[7]));
                t9.setText(String.valueOf(three[8]));
                t10.setText(String.valueOf(three[9]));

            }});
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(four[0]));
                t2.setText(String.valueOf(four[1]));
                t3.setText(String.valueOf(four[2]));
                t4.setText(String.valueOf(four[3]));
                t5.setText(String.valueOf(four[4]));
                t6.setText(String.valueOf(four[5]));
                t7.setText(String.valueOf(four[6]));
                t8.setText(String.valueOf(four[7]));
                t9.setText(String.valueOf(four[8]));
                t10.setText(String.valueOf(four[9]));

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(five[0]));
                t2.setText(String.valueOf(five[1]));
                t3.setText(String.valueOf(five[2]));
                t4.setText(String.valueOf(five[3]));
                t5.setText(String.valueOf(five[4]));
                t6.setText(String.valueOf(five[5]));
                t7.setText(String.valueOf(five[6]));
                t8.setText(String.valueOf(five[7]));
                t9.setText(String.valueOf(five[8]));
                t10.setText(String.valueOf(five[9]));

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(six[0]));
                t2.setText(String.valueOf(six[1]));
                t3.setText(String.valueOf(six[2]));
                t4.setText(String.valueOf(six[3]));
                t5.setText(String.valueOf(six[4]));
                t6.setText(String.valueOf(six[5]));
                t7.setText(String.valueOf(six[6]));
                t8.setText(String.valueOf(six[7]));
                t9.setText(String.valueOf(six[8]));
                t10.setText(String.valueOf(six[9]));

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(seven[0]));
                t2.setText(String.valueOf(seven[1]));
                t3.setText(String.valueOf(seven[2]));
                t4.setText(String.valueOf(seven[3]));
                t5.setText(String.valueOf(seven[4]));
                t6.setText(String.valueOf(seven[5]));
                t7.setText(String.valueOf(seven[6]));
                t8.setText(String.valueOf(seven[7]));
                t9.setText(String.valueOf(seven[8]));
                t10.setText(String.valueOf(seven[9]));

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(eight[0]));
                t2.setText(String.valueOf(eight[1]));
                t3.setText(String.valueOf(eight[2]));
                t4.setText(String.valueOf(eight[3]));
                t5.setText(String.valueOf(eight[4]));
                t6.setText(String.valueOf(eight[5]));
                t7.setText(String.valueOf(eight[6]));
                t8.setText(String.valueOf(eight[7]));
                t9.setText(String.valueOf(eight[8]));
                t10.setText(String.valueOf(eight[9]));

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                t1.setText((String.valueOf(nine[0])));
                t2.setText((String.valueOf(nine[1])));
                t3.setText((String.valueOf(nine[2])));
                t4.setText((String.valueOf(nine[3])));
                t5.setText((String.valueOf(nine[4])));
                t6.setText((String.valueOf(nine[5])));
                t7.setText((String.valueOf(nine[6])));
                t8.setText((String.valueOf(nine[7])));
                t9.setText((String.valueOf(nine[8])));
                t10.setText((String.valueOf(nine[9])));


            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(ten[0]));
                t2.setText(String.valueOf(ten[1]));
                t3.setText(String.valueOf(ten[2]));
                t4.setText(String.valueOf(ten[3]));
                t5.setText(String.valueOf(ten[4]));
                t6.setText(String.valueOf(ten[5]));
                t7.setText(String.valueOf(ten[6]));
                t8.setText(String.valueOf(ten[7]));
                t9.setText(String.valueOf(ten[8]));
                t10.setText(String.valueOf(ten[9]));

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(eleven[0]));
                t2.setText(String.valueOf(eleven[1]));
                t3.setText(String.valueOf(eleven[2]));
                t4.setText(String.valueOf(eleven[3]));
                t5.setText(String.valueOf(eleven[4]));
                t6.setText(String.valueOf(eleven[5]));
                t7.setText(String.valueOf(eleven[6]));
                t8.setText(String.valueOf(eleven[7]));
                t9.setText(String.valueOf(eleven[8]));
                t10.setText(String.valueOf(eleven[9]));

            }

        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(twelve[0]));
                t2.setText(String.valueOf(twelve[1]));
                t3.setText(String.valueOf(twelve[2]));
                t4.setText(String.valueOf(twelve[3]));
                t5.setText(String.valueOf(twelve[4]));
                t6.setText(String.valueOf(twelve[5]));
                t7.setText(String.valueOf(twelve[6]));
                t8.setText(String.valueOf(twelve[7]));
                t9.setText(String.valueOf(twelve[8]));
                t10.setText(String.valueOf(twelve[9]));

            }

        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(thirteen[0]));
                t2.setText(String.valueOf(thirteen[1]));
                t3.setText(String.valueOf(thirteen[2]));
                t4.setText(String.valueOf(thirteen[3]));
                t5.setText(String.valueOf(thirteen[4]));
                t6.setText(String.valueOf(thirteen[5]));
                t7.setText(String.valueOf(thirteen[6]));
                t8.setText(String.valueOf(thirteen[7]));
                t9.setText(String.valueOf(thirteen[8]));
                t10.setText(String.valueOf(thirteen[9]));

            }

        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(fourteen[0]));
                t2.setText(String.valueOf(fourteen[1]));
                t3.setText(String.valueOf(fourteen[2]));
                t4.setText(String.valueOf(fourteen[3]));
                t5.setText(String.valueOf(fourteen[4]));
                t6.setText(String.valueOf(fourteen[5]));
                t7.setText(String.valueOf(fourteen[6]));
                t8.setText(String.valueOf(fourteen[7]));
                t9.setText(String.valueOf(fourteen[8]));
                t10.setText(String.valueOf(fourteen[9]));

            }

        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(fifteen[0]));
                t2.setText(String.valueOf(fifteen[1]));
                t3.setText(String.valueOf(fifteen[2]));
                t4.setText(String.valueOf(fifteen[3]));
                t5.setText(String.valueOf(fifteen[4]));
                t6.setText(String.valueOf(fifteen[5]));
                t7.setText(String.valueOf(fifteen[6]));
                t8.setText(String.valueOf(fifteen[7]));
                t9.setText(String.valueOf(fifteen[8]));
                t10.setText(String.valueOf(fifteen[9]));

            }

        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(sixteen[0]));
                t2.setText(String.valueOf(sixteen[1]));
                t3.setText(String.valueOf(sixteen[2]));
                t4.setText(String.valueOf(sixteen[3]));
                t5.setText(String.valueOf(sixteen[4]));
                t6.setText(String.valueOf(sixteen[5]));
                t7.setText(String.valueOf(sixteen[6]));
                t8.setText(String.valueOf(sixteen[7]));
                t9.setText(String.valueOf(sixteen[8]));
                t10.setText(String.valueOf(sixteen[9]));

            }

        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(seventeen[0]));
                t2.setText(String.valueOf(seventeen[1]));
                t3.setText(String.valueOf(seventeen[2]));
                t4.setText(String.valueOf(seventeen[3]));
                t5.setText(String.valueOf(seventeen[4]));
                t6.setText(String.valueOf(seventeen[5]));
                t7.setText(String.valueOf(seventeen[6]));
                t8.setText(String.valueOf(seventeen[7]));
                t9.setText(String.valueOf(seventeen[8]));
                t10.setText(String.valueOf(seventeen[9]));

            }

        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(eighteen[0]));
                t2.setText(String.valueOf(eighteen[1]));
                t3.setText(String.valueOf(eighteen[2]));
                t4.setText(String.valueOf(eighteen[3]));
                t5.setText(String.valueOf(eighteen[4]));
                t6.setText(String.valueOf(eighteen[5]));
                t7.setText(String.valueOf(eighteen[6]));
                t8.setText(String.valueOf(eighteen[7]));
                t9.setText(String.valueOf(eighteen[8]));
                t10.setText(String.valueOf(eighteen[9]));

            }

        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(nineteen[0]));
                t2.setText(String.valueOf(nineteen[1]));
                t3.setText(String.valueOf(nineteen[2]));
                t4.setText(String.valueOf(nineteen[3]));
                t5.setText(String.valueOf(nineteen[4]));
                t6.setText(String.valueOf(nineteen[5]));
                t7.setText(String.valueOf(nineteen[6]));
                t8.setText(String.valueOf(nineteen[7]));
                t9.setText(String.valueOf(nineteen[8]));
                t10.setText(String.valueOf(nineteen[9]));

            }

        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(String.valueOf(twenty[0]));
                t2.setText(String.valueOf(twenty[1]));
                t3.setText(String.valueOf(twenty[2]));
                t4.setText(String.valueOf(twenty[3]));
                t5.setText(String.valueOf(twenty[4]));
                t6.setText(String.valueOf(twenty[5]));
                t7.setText(String.valueOf(twenty[6]));
                t8.setText(String.valueOf(twenty[7]));
                t9.setText(String.valueOf(twenty[8]));
                t10.setText(String.valueOf(twenty[9]));

            }

        });

    }
}
