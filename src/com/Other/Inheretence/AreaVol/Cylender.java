package com.Other.Inheretence.AreaVol;

public class Cylender extends Circle{
    private int height;


    public Cylender (int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double area(){
        return ( (2 * Math.PI * getRadius() * height) + ( 2 * super.area()) );
    }

    public double volume(){
        return (super.area() * height);
    }
}
