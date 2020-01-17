package com.example.a65667.a2048;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

@SuppressLint("Registered")
public class MyApp extends Application {

    @SuppressLint("StaticFieldLeak")
    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
