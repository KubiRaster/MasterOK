package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Prodlenka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodlenka);
        WebView webView = (WebView)findViewById(R.id.webView222);

        webView.loadUrl("file:///android_asset/prodlenka.html");
    }
}
