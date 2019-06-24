package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game3 extends AppCompatActivity implements View.OnClickListener {

    Button[] button = new Button[3];
    TextView textView;
    String[] English;
    String[] Russian;

    int i, j, t;
    int k1, k2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        button[0] = (Button) findViewById(R.id.button1);
        button[1] = (Button) findViewById(R.id.button2);
        button[2] = (Button) findViewById(R.id.button3);

        English = getResources().getStringArray(R.array.English);
        Russian = getResources().getStringArray(R.array.Russian);

        textView = (TextView) findViewById(R.id.textView);
        go();


    }

    private void go() {

        Random randInt = new Random();
        i = randInt.nextInt(18);
        i++;
        textView.setText(Russian[i]);
        j = randInt.nextInt(3);
        t = randInt.nextInt(18);
        while ((t == i) || (t == 19 - i)) {
            t = randInt.nextInt(18);
        }
        button[j].setText(English[i]);
        if (j == 0) {
            button[1].setText(English[19 - i]);
            button[2].setText(English[t]);
        } else {
            if (j == 1) {
                button[0].setText(English[19 - i]);
                button[2].setText(English[t]);
            } else {
                button[0].setText(English[19 - i]);
                button[1].setText(English[t]);
            }
        }
        k2 = j;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1:
                k1 = 0;
                break;
            case R.id.button2:
                k1 = 1;
                break;
            case R.id.button3:
                k1 = 2;
                break;
        }

        if (k1 == k2) {
            Toast toast = Toast.makeText(getApplicationContext(), "Верно!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            go();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Попробуй снова!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();


        }

    }
}

