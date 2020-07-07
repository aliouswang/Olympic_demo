package com.hxjb.olympic_demo;

import android.app.Application;

import com.tencent.mmkv.MMKV;

/**
 * create by aliouswang
 */
public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String dir = getFilesDir().getAbsolutePath() + "/mmkv_2";
        MMKV.initialize(dir);
    }
}
