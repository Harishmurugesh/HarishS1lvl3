package com.example.harishs1level3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public Button b3;
    public TextView t4;
    public EditText e1;

    public View.OnClickListener clickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double c = 300000000;
            if (e1.getText().toString().equals(""))
                toast1();
            else {
                double d = Double.valueOf(e1.getText().toString());
                if (c < d)
                    toast2();
                else {
                    double e = 1 / (Math.sqrt(1 - Math.pow((d / c), 2)));
                    ((TextView) findViewById(R.id.textView4)).setText("Answer :" + e);
                }
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b3 = (Button) findViewById(R.id.button3);
        t4 = (TextView) findViewById(R.id.textView4);
        e1 = (EditText) findViewById(R.id.editText1);
        b3.setOnClickListener(clickListener2);
    }
    public void toast1(){
        Toast.makeText(MainActivity2.this,"Enter Velocity",Toast.LENGTH_SHORT).show();
    }
    public void toast2(){
        Toast.makeText(MainActivity2.this,"Invalid Input",Toast.LENGTH_SHORT).show();
    }
}