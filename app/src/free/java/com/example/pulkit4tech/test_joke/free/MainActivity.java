package com.example.pulkit4tech.test_joke.free;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.Jokes;
import com.example.pulkit4tech.test_joke.MyAsyncTask;
import com.example.pulkit4tech.test_joke.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    AdView adView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        adView = (AdView) findViewById(R.id.adView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start AsyncTask
                new MyAsyncTask(MainActivity.this).execute();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);

    }
}
