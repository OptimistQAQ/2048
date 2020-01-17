package com.example.a65667.a2048.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.a65667.a2048.MyApp;

public class SPData {

    @SuppressLint("StaticFieldLeak")
    private static Context context = MyApp.getContext();
    private static final String LOVE_2048 = "love2048";

    @SuppressLint("ApplySharedPref")
    public static boolean saveBestScore(int bestScore){
        SharedPreferences preferences = context.getSharedPreferences(LOVE_2048, Context.MODE_PRIVATE);
        return preferences.edit().putInt("bestScore", bestScore).commit();
    }

//    public static int getBestScore(){
//        SharedPreferences preferences = context.getSharedPreferences(LOVE_2048,Context.MODE_PRIVATE);
//        return preferences.getInt("bestScore",0);
//    }

}
