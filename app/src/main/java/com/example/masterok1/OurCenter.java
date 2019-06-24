package com.example.masterok1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class OurCenter extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(OurCenter.this, Lenta.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(OurCenter.this, Games.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_center);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ListView listView = (ListView) findViewById(R.id.listView);
        final String[] Web1 = getResources().getStringArray(R.array.Web);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, Web1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                String[] Web2 = getResources().getStringArray(R.array.Web);
                if (strText.equalsIgnoreCase(Web2[0])) {
                    Intent intent = new Intent(OurCenter.this, Sadik.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[1])) {
                    Intent intent = new Intent(OurCenter.this, Math.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[2])) {
                    Intent intent = new Intent(OurCenter.this, Prodlenka.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[3])) {
                    Intent intent = new Intent(OurCenter.this, English.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[4])) {
                    Intent intent = new Intent(OurCenter.this, Jivopis.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[5])) {
                    Intent intent = new Intent(OurCenter.this, Plastilin.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[6])) {
                    Intent intent = new Intent(OurCenter.this, Repetitor.class);
                    startActivity(intent);
                }
                if (strText.equalsIgnoreCase(Web2[7])) {
                    Intent intent = new Intent(OurCenter.this, Shaxmaty.class);
                    startActivity(intent);
                }
}
        });
    }

}

