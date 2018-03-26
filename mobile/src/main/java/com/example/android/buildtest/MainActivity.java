package com.example.android.buildtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.buildtest.FlavorVariant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlavorVariant variant = new FlavorVariant();
        TextView textview = findViewById(R.id.helloWorld);
        textview.setText(variant.getString());
    }
}
