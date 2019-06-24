package com.example.masterok1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Game1 extends AppCompatActivity {

    Button[] buttons = new Button[11];
    int[] numbers = new int[9];

    int t = 1;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        buttons[1] = (Button) findViewById(R.id.button);
        buttons[2] = (Button) findViewById(R.id.button2);
        buttons[3] = (Button) findViewById(R.id.button3);
        buttons[4] = (Button) findViewById(R.id.button4);
        buttons[5] = (Button) findViewById(R.id.button5);
        buttons[6] = (Button) findViewById(R.id.button6);
        buttons[7] = (Button) findViewById(R.id.button7);
        buttons[8] = (Button) findViewById(R.id.button8);
        buttons[9] = (Button) findViewById(R.id.button9);



        for (int i = 0; i < 9; i++) {
            numbers[i] = i + 1;
        }

        buttons[1].setText(String.valueOf(numbers[0]));
        buttons[2].setText(String.valueOf(numbers[1]));
        buttons[3].setText(String.valueOf(numbers[2]));
        buttons[4].setText(String.valueOf(numbers[3]));
        buttons[5].setText(String.valueOf(numbers[4]));
        buttons[6].setText(String.valueOf(numbers[5]));
        buttons[7].setText(String.valueOf(numbers[6]));
        buttons[8].setText(String.valueOf(numbers[7]));
        buttons[9].setText(String.valueOf(numbers[8]));


    }

    public void perem() {
        Random randInt = new Random();
        int k1 = randInt.nextInt(9);
        int k2 = randInt.nextInt(9);


        int NUM;
        NUM = numbers[k1];
        numbers[k1] = numbers[k2];
        numbers[k2] = NUM;

    }


    public void onClick() {

        perem();
        perem();
        perem();
        perem();

        buttons[1].setText(String.valueOf(numbers[0]));
        buttons[2].setText(String.valueOf(numbers[1]));
        buttons[3].setText(String.valueOf(numbers[2]));
        buttons[4].setText(String.valueOf(numbers[3]));
        buttons[5].setText(String.valueOf(numbers[4]));
        buttons[6].setText(String.valueOf(numbers[5]));
        buttons[7].setText(String.valueOf(numbers[6]));
        buttons[8].setText(String.valueOf(numbers[7]));
        buttons[9].setText(String.valueOf(numbers[8]));
        for (int i = 1; i < 10; i++) {
            buttons[i].setVisibility(View.VISIBLE);
        }

        t = 1;

        //colors[0] = getResources().getColorStateList(R.color.Game1);




    }

    public void Next(View view) {

        switch (view.getId()) {
            case R.id.button:
                k = numbers[0];
                break;
            case R.id.button2:
                k = numbers[1];
                break;
            case R.id.button3:
                k = numbers[2];
                break;
            case R.id.button4:
                k = numbers[3];
                break;
            case R.id.button5:
                k = numbers[4];
                break;
            case R.id.button6:
                k = numbers[5];
                break;
            case R.id.button7:
                k = numbers[6];
                break;
            case R.id.button8:
                k = numbers[7];
                break;
            case R.id.button9:
                k = numbers[8];
                break;
        }

        if (k == t) {
            t++;
            for (int i = 0; i < 9; i++) {
                if (numbers[i] == k) {
                    buttons[i+1].setVisibility(View.GONE);
                }
            }

        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Попробуй снова!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();


        }

        if(k==9){

            onClick();
            Toast toast = Toast.makeText(getApplicationContext(), "Поздравляю! Все верно!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

        }
    }
}
