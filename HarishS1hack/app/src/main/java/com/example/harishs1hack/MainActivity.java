package com.example.harishs1hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button button;
    public View.OnClickListener clickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.button1:{
                    Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent1);
                }break;
                case R.id.button2:{
                    Intent intent2 = new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent2);
                }break;
                case R.id.button:{
                    Intent intent3 = new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent3);
                }break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);
        b1.setOnClickListener(clickListener1);
        b2.setOnClickListener(clickListener1);
        button.setOnClickListener(clickListener1);
    }
}