package com.example;

public class MoodAnalyser {
  
    public String MoodAnalyse(String message){
        if(message.equals("I am in Sad Mood")) return "SAD";
        return "HAPPY";
    }
}