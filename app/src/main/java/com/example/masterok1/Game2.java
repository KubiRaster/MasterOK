package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game2 extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    TextView textView;

    int a = 1;
    int b = 1;
    int c = 2;
    int t;
    String str;

    public void perem() {
        Random randInt = new Random();
        a = randInt.nextInt(8);
        a++;
        b = randInt.nextInt(9 - a);
        b++;
        c = a + b;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        textView = (TextView) findViewById(R.id.textView);
        str = a + " + " + b + " = ";
        textView.setText(str);

    }
        public void again(){
            perem();
            str = a + " + " + b + " = ";
            textView.setText(str);
        }

        public void onClick (View view) throws InterruptedException {
            switch (view.getId()) {
                case R.id.button1:
                    t = 1;
                    break;
                case R.id.button2:
                    t = 2;
                    break;
                case R.id.button3:
                    t = 3;
                    break;
                case R.id.button4:
                    t = 4;
                    break;
                case R.id.button5:
                    t = 5;
                    break;
                case R.id.button6:
                    t = 6;
                    break;
                case R.id.button7:
                    t = 7;
                    break;
                case R.id.button8:
                    t = 8;
                    break;
                case R.id.button9:
                    t = 9;
                    break;
            }

            if (c == Integer.valueOf(t)) {
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
}
