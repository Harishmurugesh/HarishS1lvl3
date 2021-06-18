package com.example.harishs1level3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity4 extends AppCompatActivity {
    private int hr,min,sec;
    private  double spi;
    Calendar calendar;
    TextView t11 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t11 = (TextView) findViewById(R.id.textView11);

        Thread thread = new Thread(){
            public  void run(){
                while (!isInterrupted()){
                    try {
                        Thread.sleep(1000);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int fact = 1;
                                calendar = Calendar.getInstance();
                                hr = calendar.get(Calendar.HOUR);
                                min = calendar.get(Calendar.MINUTE);
                                sec = calendar.get(Calendar.SECOND);
                                for(int k=1 ; k<=hr ; k++)
                                {
                                    fact = fact * k;
                                }
                                spi = fact / (Math.pow(min,3) + sec);
                                t11.setText(String.valueOf(spi));
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}