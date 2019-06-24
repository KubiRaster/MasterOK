package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game4 extends AppCompatActivity {
    int k;
    int i;
    Button[] buttons = new Button[11];
    TextView textView;
    String[] Colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);

        buttons[1] = (Button) findViewById(R.id.button1);
        buttons[2] = (Button) findViewById(R.id.button2);
        buttons[3] = (Button) findViewById(R.id.button3);
        buttons[4] = (Button) findViewById(R.id.button4);
        buttons[5] = (Button) findViewById(R.id.button5);
        buttons[6] = (Button) findViewById(R.id.button6);
        buttons[7] = (Button) findViewById(R.id.button7);
        buttons[8] = (Button) findViewById(R.id.button8);
        buttons[9] = (Button) findViewById(R.id.button9);
        Colors = getResources().getStringArray(R.array.Colors);

        Random randInt = new Random();
        i = randInt.nextInt(8);
        i++;
        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(Colors[i - 1]);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                k = 1;
                break;
            case R.id.button2:
                k = 2;
                break;
            case R.id.button3:
                k = 3;
                break;
            case R.id.button4:
                k = 4;
                break;
            case R.id.button5:
                k = 5;
                break;
            case R.id.button6:
                k = 6;
                break;
            case R.id.button7:
                k = 7;
                break;
            case R.id.button8:
                k = 8;
                break;
            case R.id.button9:
                k = 9;
                break;
        }
        if (i == k) {

            Toast toast = Toast.makeText(getApplicationContext(), "Верно!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            again();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Попробуй снова!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }


    }

    private void again() {
        Random randInt = new Random();
        i = randInt.nextInt(8);
        i++;
        textView.setText(Colors[i - 1]);
    }


}

