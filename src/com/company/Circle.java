package com.company;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.type = "Circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        if (drawable()) {
            return Math.PI * Math.pow(radius, 2);
        }
        return 0;
    }

    @Override
    public boolean drawable() {
        if(radius > 0){
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
                    ", radius=" + getRadius() + '\'' ;
        } else return Color.Black + type + ": Can`t draw this figure." + Color.RESET;
    }
}
