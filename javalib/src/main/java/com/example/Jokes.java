package com.example;

import java.util.Random;

public class Jokes {

    String jokes[] = {"There are only 10 types of people in the world: those that understand binary and those that don’t.",
            "Computers make very fast, very accurate mistakes.",
            "Be nice to the nerds, for all you know they might be the next Bill Gates!",
            "Artificial intelligence usually beats real stupidity.",
            "CAPS LOCK – Preventing Login Since 1980.",
            "In a world without fences and walls, who needs Gates and Windows?",
            "Computers are like air conditioners: they stop working when you open Windows."
    };

    public String getJoke(){
        return jokes[new Random().nextInt(jokes.length)];
    }
}
