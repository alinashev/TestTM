package com.company;

public class Square extends Figure{
    private double sideLength;

    public Square(double sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
        this.type = "Square";
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double area() {
        if(drawable()) {
            return Math.pow(sideLength, 2);
        }
        return 0;
    }

    @Override
    public boolean drawable() {
        if(sideLength > 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if(drawable()) {
            return "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", area=" + area() + '\'' +
                    ", side=" + getSideLength() + '\'' ;
        } else return Color.Black + type + ": Can`t draw this figure." + Color.RESET;
    }
}
