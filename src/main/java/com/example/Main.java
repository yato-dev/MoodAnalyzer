package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program");

        
        MoodAnalyser mood1= new MoodAnalyser("I am in Sad Mood"); // SAD
        MoodAnalyser mood2= new MoodAnalyser("I am in Happy Mood"); // HAPPY
        MoodAnalyser mood3= new MoodAnalyser("I am in Any Mood");   // HAPPY
        MoodAnalyser mood4= new MoodAnalyser(null);      // HAPPY
        MoodAnalyser mood5= new MoodAnalyser("");       // HAPPY
        }
    }