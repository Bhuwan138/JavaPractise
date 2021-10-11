package com.Other.Polymorfizm.shape;

public class UseShape {
    public static void main (String[] args) {
        Shape s = new Rectangle();
        s.display();
        s = new Circle();
        s.display();
        s = new Triangle();
        s.display();
    }


}
