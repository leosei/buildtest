package com.example.android.buildtest;

import android.util.Log;

/**
 * Created by leosei on 3/23/18.
 */

public class FlavorVariant {

    public FlavorVariant(){

        Log.i("TEXT", "hello world from variant free");
    }

    public String getString(){
        return "Hello Free World";

    }

    public void onClick(View v){
        Log.i("FREE","click registered");
        return;
    }
}
