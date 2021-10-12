package com.Other.Interface;

public class Rectangle implements Shape{

    private double length, breadth;

    public Rectangle (double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area () {
        return length * breadth;
    }

    @Override
    public String nameOfShape () {
        return "Rectangle";
    }
}
