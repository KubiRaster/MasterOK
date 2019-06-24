package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Plastilin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastilin);
          WebView webView = (WebView)findViewById(R.id.webViewPlast);
        webView.loadUrl("file:///android_asset/plastilin.html");
    }
}
