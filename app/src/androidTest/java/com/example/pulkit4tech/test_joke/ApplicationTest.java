package com.example.pulkit4tech.test_joke;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;

import com.example.Jokes;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {


    public ApplicationTest(){
        super(MainActivity.class);
    }

    public void testVerifyAsyncTask(){
        assertNotNull(new Jokes().getJoke());
    }

}