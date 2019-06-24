package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Jivopis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jivopis);

        WebView webView = (WebView)findViewById(R.id.webViewj);
        webView.loadUrl("file:///android_asset/jivopis.html");
    }
}
