package com.Other.Inheretence.AreaVol;

public class Circle {
    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    public int getRadius () {
        return radius;
    }

    public double area(){
        return (Math.PI * Math.pow(radius,2));
    }
}
