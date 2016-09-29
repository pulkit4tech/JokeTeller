package com.example;

import java.util.Random;

public class Jokes {

    String jokes[] = {"Something","Some joke","IDK","what the hell!!"};

    public String getJoke(){
        return jokes[new Random().nextInt(jokes.length)];
    }
}
