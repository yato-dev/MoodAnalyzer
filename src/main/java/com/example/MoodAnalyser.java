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
        String sad= "I am in Sad Mood";
        try {
            if (message.equals(sad)) return "SAD";
        }
        catch (Exception e){
            return "HAPPY";
        }
        return "HAPPY";
    }
}