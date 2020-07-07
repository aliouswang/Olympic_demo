package com.hxjb.olympic_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tencent.mmkv.MMKV;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MMKV.defaultMMKV().putInt("age", 18).commit();

        Log.e("age", MMKV.defaultMMKV().decodeInt("age") + "");
    }
}