package com.company;

public class Triangle extends Figure{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.color = color;
        this.type = "Triangle";
    }

    public double getHypotenuse(){
        if(drawable()){
            return maxSide();
        }
        return 0;
    }

    private double maxSide(){
        return Math.max(thirdSide,Math.max(firstSide, secondSide));
    }
    private double minSide(){
        return Math.min(thirdSide,Math.max(firstSide, secondSide));
    }
    private double middleSide(){
        return firstSide + secondSide + thirdSide - maxSide() - maxSide();
    }
    @Override
    public double area() {
        if(drawable()) {
            return 0.5 * minSide() * middleSide();
        }
        return 0;
    }

    @Override
    public boolean drawable() {
        if(firstSide > 0 & secondSide > 0 &  thirdSide > 0) {
            if (maxSide() < minSide() + middleSide()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if(drawable()) {
            return "type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    ", area=" + area() + '\'' +
                    ", hypotenuse=" + getHypotenuse() + '\'' ;
        } else return Color.Black + type + ": Can`t draw this figure." + Color.RESET;
    }
}
