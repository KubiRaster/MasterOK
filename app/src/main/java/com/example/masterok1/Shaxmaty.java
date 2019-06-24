package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Shaxmaty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shaxmaty);

        WebView webView = (WebView)findViewById(R.id.webViewShax);
        webView.loadUrl("file:///android_asset/shaxmaty.html");
    }
}
