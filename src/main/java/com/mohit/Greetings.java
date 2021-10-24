package com.mohit;
import java.util.Random;

public class Greetings {
    String[] greetings={"Hello","Hola","Namaste"};
    Random r = new Random();

    String getRandomGreeting(){
        return greetings[r.nextInt(3)];
    }
}
