package com.example.backend;

import com.example.TellJoke;

import java.util.Random;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    private TellJoke jokes;

    MyBean(){ jokes = new TellJoke();}

    public String getJoke(){
        Random rand = new Random();
        int  jokeNumber = rand.nextInt(3);
        return jokes.tellAJoke(jokeNumber);
    }
}
