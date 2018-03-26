package com.example.android.buildtest;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by leosei on 3/23/18.
 */

public class FlavorVariant {

    public FlavorVariant(){

        Log.i("TEXT", "hello world from variant Paid");
    }

    public String getString(){
        return "Hello Paid World";

    }

    public void onClick(View v){
        Log.i("PAID","click registered");
        //TextView text = findViewById(R.id.helloWorld);
        //text.setText("Paid click");
        return;
    }
}
