package com.Other.Polymorphism.Shape;

public class UseShape {
    public static void main (String[] args) {
        Shape s = new Rectangle();
        s.display();
        s.show();
        s = new Circle();
        s.display();
        s.show();
        s = new Triangle();
        s.display();
        s.show();
    }


}
