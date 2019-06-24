package com.example.masterok1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

public class Lenta extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:
                    Intent intent1 = new Intent(Lenta.this, OurCenter.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(Lenta.this, Games.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenta);
        WebView WV =(WebView) findViewById(R.id.WebView_Lenta);
        WV.getSettings();
        WV.setBackgroundColor(Color.TRANSPARENT);
        WV.getSettings().setJavaScriptEnabled(true);
        WV.loadUrl("file:///android_asset/VK.html");
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
