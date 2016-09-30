package com.example.pulkit4tech.test_joke.paid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.Jokes;
import com.example.pulkit4tech.test_joke.MyAsyncTask;
import com.example.pulkit4tech.test_joke.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Jokes myjoke = new Jokes();
        final TextView joke = (TextView) findViewById(R.id.showJoke);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start AsyncTask
                new MyAsyncTask(MainActivity.this).execute();
            }
        });
    }
}
