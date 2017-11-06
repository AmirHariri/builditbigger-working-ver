package com.example.android.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        Intent jokeIntent = getIntent();
        String newJoke = jokeIntent.getStringExtra("JOKE");
        TextView textViewJoke = (TextView) findViewById(R.id.tv_joke);
        textViewJoke.setText(newJoke);
    }
}
