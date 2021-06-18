package com.example.harishs1hack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText e2,e3;
    Button b4;
    TextView t8,t9;
    ConstraintLayout c3;
    Vibrator vibrator;

    public View.OnClickListener clickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view1) {
            double g = 300000000;
            if ((e2.getText().toString().equals("")) || (e3.getText().toString().equals("")))
            {toast3();}
            else{
                Double h = Double.valueOf(e2.getText().toString());
                Double i = Double.valueOf(e3.getText().toString());
                if (h > g)
                {toast4();}
                else
                {  double j= 1/(Math.sqrt(1-Math.pow((h/g),2)));
                    if(i==j){
                        t8.setText("Correct Answer");
                        t9.setText("Correct Answer is :"+ j);
                        c3.setBackgroundColor(Color.GREEN);
                    }
                    else{
                        t8.setText("Wrong Answer");
                        t9.setText("Correct Answer is :"+ j);
                        c3.setBackgroundColor(Color.RED);
                        vibrator.vibrate(1000);
                    }

                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(clickListener3);
        t8 = (TextView) findViewById(R.id.textView8);
        t9 = (TextView) findViewById(R.id.textView9);
        c3 = (ConstraintLayout) findViewById(R.id.constraintLayout3);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

    }
    public void toast3(){
        Toast.makeText(MainActivity3.this,"Enter Values",Toast.LENGTH_SHORT).show();
    }
    public void toast4(){
        Toast.makeText(MainActivity3.this,"Invalid inputs",Toast.LENGTH_SHORT).show();
    }
}