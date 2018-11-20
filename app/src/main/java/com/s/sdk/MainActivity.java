package com.s.sdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.s.sdk.slib.SLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SLib sLib = new SLib();
        sLib.showASDKAlert(this);
    }
}
