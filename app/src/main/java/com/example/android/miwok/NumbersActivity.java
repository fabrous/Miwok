package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        Log.v("NumbersActivity", "Word at index 1:" + words[1]);
        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
        Log.v("NumbersActivity", "Word at index 3: " + words[3]);

    }
}
