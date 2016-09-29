package com.example.pulkit4tech.test_joke.Service;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.androidlibrary.JokeActivity;
import com.example.pulkit4tech.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by pulkit4tech on 29/9/16.
 */
public class MyAsyncTask extends AsyncTask<Context,Void,String> {

    MyApi myApi;
    Context mContext;

    MyAsyncTask (Context mContext){
        this.mContext = mContext;
        MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),new AndroidJsonFactory(),null).
                setRootUrl("http://10.0.2.2:8080/_ah/api/").setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
            @Override
            public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                abstractGoogleClientRequest.setDisableGZipContent(true);
            }
        });
        myApi = builder.build();
    }

    @Override
    protected String doInBackground(Context... contexts) {

        String result = "Sorry some error!! No joke today";
        try {
            result = myApi.getJoke().execute().getData();
            Log.i("JOKE",result);

        }
        catch (Exception e){
            Log.e("ERROR",e.toString());
        }
        return result;
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(mContext,"YO !! cheers to the joke",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, JokeActivity.class);
        intent.putExtra("Jokes",result);
        mContext.startActivity(intent);
    }
}
