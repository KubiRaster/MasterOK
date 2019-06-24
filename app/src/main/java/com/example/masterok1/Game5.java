package com.example.masterok1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game5 extends AppCompatActivity {
    int k = 0, r = 0;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game5);
        imageView = (ImageView) findViewById(R.id.imageView1);

        GridView listView = (GridView) findViewById(R.id.listView);
        final String[] Animals1 = getResources().getStringArray(R.array.Animals);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Game5.this, R.layout.support_simple_spinner_dropdown_item, Animals1);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                String[] Web2 = getResources().getStringArray(R.array.Animals);
                if (strText.equalsIgnoreCase(Animals1[0])) {
                    k = 0;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[1])) {
                    k = 1;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[2])) {
                    k = 2;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[3])) {
                    k = 3;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[4])) {
                    k = 4;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[5])) {
                    k = 5;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[6])) {
                    k = 6;
                    Play();
                }
                if (strText.equalsIgnoreCase(Animals1[7])) {
                    k = 7;
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
                    imageView.setImageResource(R.drawable.hourse);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.momo);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.olen);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.cat);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.rabbit);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.fox);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.chiken);
                    break;
                case 7:
                    imageView.setImageResource(R.drawable.dog);
                    break;

            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Попробуй снова!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}
