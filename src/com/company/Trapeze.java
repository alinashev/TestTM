package com.company;

public class Trapeze extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public Trapeze(double firstSide, double secondSide, double height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.color = color;
        this.type = "Trapeze";
    }

    public double getMiddLine() {
        if(drawable()) {
            return 0.5 * (firstSide + secondSide);
        }
        return 0;
    }

    @Override
    public double area() {
        return getMiddLine() * height;
    }

    @Override
    public boolean drawable() {
        if(firstSide > 0 & secondSide > 0 & height > 0){
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
                    ", middle line=" + getMiddLine() + '\'' ;
        } else return Color.Black + type + ": Can`t draw this figure." + Color.RESET;
    }
}
