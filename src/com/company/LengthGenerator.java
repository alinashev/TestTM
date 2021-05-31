package com.company;

public class LengthGenerator {
    private static LengthGenerator lengthGenerator;

    public static LengthGenerator gen(){
        if(lengthGenerator == null){
            lengthGenerator = new LengthGenerator();
        }
        return lengthGenerator;
    }

    public double getValue(){
        return (Math.random() * 10);
    }
}
