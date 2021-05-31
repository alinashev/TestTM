package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Figure> figures = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < LengthGenerator.gen().getValue(); i++){
           figures.add(new Circle(LengthGenerator.gen().getValue(), Color.generateColor()));
        }

        for (int i = 0; i < LengthGenerator.gen().getValue(); i++){
            figures.add(new Triangle(LengthGenerator.gen().getValue(),
                    LengthGenerator.gen().getValue(),
                    LengthGenerator.gen().getValue(),
                    Color.generateColor()));
        }

        for (int i = 0; i < LengthGenerator.gen().getValue(); i++){
            figures.add(new Square(LengthGenerator.gen().getValue(), Color.generateColor()));
        }

        for (int i = 0; i < LengthGenerator.gen().getValue(); i++){
            figures.add(new Trapeze(LengthGenerator.gen().getValue(),
                    LengthGenerator.gen().getValue(),
                    LengthGenerator.gen().getValue(),
                    Color.generateColor()));
        }

        print();
    }

    private static void print(){
        for(int i = 0; i < figures.size(); i++){
            System.out.println(Color.fill(figures.get(i).color) + figures.get(i) + Color.RESET);
        }
    }
}
