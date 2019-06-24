package com.example.masterok1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextMessage;
    TextView textView5;
    EditText editText;
    Button button1;
    SharedPreferences sPref;
    final String SAVED_TEXT = "";


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MainActivity.this, Lenta.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dashboard:
                    Intent intent1 = new Intent(MainActivity.this, OurCenter.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(MainActivity.this, Games.class);
                    startActivity(intent2);
                    return true;
            }

            return false;



        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        textView5 = (TextView) findViewById(R.id.textView5);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        editText = (EditText) findViewById(R.id.editText);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        sPref = getPreferences(MODE_PRIVATE);
        if(sPref.contains(SAVED_TEXT)){
            String savedText = sPref.getString(SAVED_TEXT,"");
            textView5.setText(savedText);
            textView5.setVisibility(View.VISIBLE);
            editText.setVisibility(View.GONE);
            button1.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        saveText();


    }

    private void saveText() {
        sPref= getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT,editText.getText().toString());
        ed.commit();
        Toast toast = Toast.makeText(getApplicationContext(), "Поздравляем Ваше имя сохранено!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }
}


