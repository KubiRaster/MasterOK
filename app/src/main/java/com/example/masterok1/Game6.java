package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game6 extends AppCompatActivity {
    int k = 0, r = 0;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game6);
        imageView = (ImageView) findViewById(R.id.imageView1);

        GridView listView = (GridView) findViewById(R.id.listView);
        final String[] Shapes1 = getResources().getStringArray(R.array.Shapes);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Game6.this,R.layout.support_simple_spinner_dropdown_item,Shapes1);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                String[] Web2 = getResources().getStringArray(R.array.Shapes);
                if (strText.equalsIgnoreCase(Shapes1[0])) {
                    k = 0;
                    Play();
                }
                if (strText.equalsIgnoreCase(Shapes1[1])) {
                    k = 1;
                    Play();
                }
                if (strText.equalsIgnoreCase(Shapes1[2])) {
                    k = 2;
                    Play();
                }
                if (strText.equalsIgnoreCase(Shapes1[3])) {
                    k = 3;
                    Play();
                }
                if (strText.equalsIgnoreCase(Shapes1[4])) {
                    k = 4;
                    Play();
                }
                if (strText.equalsIgnoreCase(Shapes1[5])) {
                    k = 5;
                    Play();
                }
            }
        });
    }

    public void perem() {
        Random randInt = new Random();
        r = randInt.nextInt(8);
    }

    public void Play() {

        if (k == r) {
            perem();
            switch (r) {
                case 0:
                    imageView.setImageResource(R.drawable.square);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.circle);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.pryam);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.serd);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.zvezda);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.triangle);
                    break;

            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Попробуй снова!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}