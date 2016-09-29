package com.example.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by pulkit4tech on 29/9/16.
 */
public class JokeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);
        final TextView joke = (TextView) findViewById(R.id.showawesomJoke);
        Intent intent = getIntent();
        joke.setText(intent.getCharSequenceExtra("Jokes"));
    }
}
