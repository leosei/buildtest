package com.example.android.buildtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.buildtest.FlavorVariant;

public class MainActivity extends AppCompatActivity {

    private static FlavorVariant mVariant;
    private static TextView mText;
    private static ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVariant = new FlavorVariant();
        TextView mText = findViewById(R.id.helloWorld);
        mText.setText(mVariant.getString());

        ImageView mImage = findViewById(R.id.animalImage);
        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVariant.onClick(view);
            }
        });
    }
}
