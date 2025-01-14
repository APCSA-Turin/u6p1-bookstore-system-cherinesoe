package com.example.project;

public class IdGenerate{ 
    //This class contains statics variable and methods, you do not initalize an object to use it.
    
    //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    //requires one empty constructor
    public IdGenerate() {}
    
    //returns current id
    public static String getCurrentId() {return currentId;}

    //resets currentId to 99
    public static void reset() {
        currentId = "99";
    } 

    //generates a new id, increments the currentId by 1
    public static void generateID() {
        int id = Integer.valueOf(currentId);
        id++;
        currentId = "" + id + "";
    } 
}