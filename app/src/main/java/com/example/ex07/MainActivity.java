package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wV;
    String stringUrl;
    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        et= (EditText) findViewById(R.id.editText);
        wV = (WebView)findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.setWebViewClient(new MyWebViewClient());

    }

    public void go(View view) {
        String st =et.getText().toString();
        wV.loadUrl(st);
    }


    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}