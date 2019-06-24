package com.example.masterok1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Repetitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repetitor);

        WebView webView = (WebView)findViewById(R.id.webViewRep);
        webView.loadUrl("file:///android_asset/repetitor.html");
    }
}
