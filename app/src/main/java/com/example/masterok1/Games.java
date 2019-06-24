package com.example.masterok1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Games extends AppCompatActivity {

   //private TextView mTextMessage;
    ImageButton[] buttons = new ImageButton[6];

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Intent intent = new Intent(Games.this, Lenta.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent1 = new Intent(Games.this, OurCenter.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        buttons[0] = (ImageButton) findViewById(R.id.imageButton);
        buttons[1] = (ImageButton) findViewById(R.id.imageButton2);
        buttons[2] = (ImageButton) findViewById(R.id.imageButton3);
        buttons[3] = (ImageButton) findViewById(R.id.imageButton4);
        buttons[4] = (ImageButton) findViewById(R.id.imageButton5);
        buttons[5] = (ImageButton) findViewById(R.id.imageButton6);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent(Games.this, Game1.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                Intent intent2 = new Intent(Games.this, Game2.class);
                startActivity(intent2);
                break;
            case R.id.imageButton3:
                Intent intent3 = new Intent(Games.this, Game3.class);
                startActivity(intent3);
                break;
            case R.id.imageButton4:
                Intent intent4 = new Intent(Games.this, Game4.class);
                startActivity(intent4);
                break;
            case R.id.imageButton5:
                Intent intent5 = new Intent(Games.this, Game5.class);
                startActivity(intent5);
                break;
            case R.id.imageButton6:
                Intent intent6 = new Intent(Games.this, Game6.class);
                startActivity(intent6);
                break;




        }

    }


}

