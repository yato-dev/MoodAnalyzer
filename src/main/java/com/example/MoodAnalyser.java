package com.example;


public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){
    message="";
    }
    public MoodAnalyser(String message){
        this.message=message;
        System.out.println(MoodAnalyse());
    }

    
    private String MoodAnalyse(){
        if(message.equals("I am in Sad Mood")) return "SAD";
        return "HAPPY";
    }
}