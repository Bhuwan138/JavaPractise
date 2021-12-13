package com.Other.Interface;

public class Circle implements Shape{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2) ;
    }

    @Override
    public String nameOfShape () {
        return "Circle";
    }
}
