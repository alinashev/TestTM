package com.company;

import java.util.HashMap;

public class Color {
    public static final String RESET = "\u001B[0m";
    public static final String Black = "\u001B[30m";

    private static HashMap<Integer, String> colorsIndex = new HashMap<>(){
        {
            put(0, "Red");
            put(1, "Green");
            put(2, "Yellow");
            put(3, "Blue");
            put(4, "Purple");
            put(5, "Cyan");
        }
    };

    public static String generateColor(){
        return colorsIndex.get((int)Math.round(Math.random() * 10 / 2));
    }
    private static HashMap<String, String> colorsCode = new HashMap<>(){
        {
            put("Red", "\u001B[31m");
            put("Green", "\u001B[32m");
            put("Yellow", "\u001B[33m");
            put("Blue", "\u001B[34m");
            put("Purple", "\u001B[35m");
            put("Cyan", "\u001B[36m");
        }
    };

    public static String fill(String color){
        return colorsCode.get(color);
    }
}
