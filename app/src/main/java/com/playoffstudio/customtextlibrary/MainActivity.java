package com.playoffstudio.customtextlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.text.fornt.FontCache;

public class MainActivity extends AppCompatActivity {


    public FontCache fontCache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fontCache = new FontCache();
        fontCache.setCustmFont("fonts/Raleway-Bold.ttf");
    }
}
