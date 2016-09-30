package com.example.pulkit4tech.test_joke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.Jokes;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Jokes myjoke = new Jokes();
        final TextView joke = (TextView) findViewById(R.id.showJoke);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start AsyncTask

                new MyAsyncTask(MainActivity.this).execute();
            }
        });
    }
}
