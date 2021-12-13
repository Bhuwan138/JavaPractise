package com.ExamPractise;

class Shapes{
    private double radius,height;

    public Shapes(double radius){
        this.radius = radius;
    }

    public Shapes(double radius, double height) {
        this.radius =radius;
        this.height = height;
    }
    public void area(double radius){
        System.out.println("Area of Circle is : " + (Math.PI * Math.pow(radius,2)));
    }

    public void area(double radius,double height){
        System.out.println("Area of cylender is : " + ((2*Math.PI*radius*height) + (2*Math.PI*Math.pow(radius,2))));
    }
}

public class UseOverloding {
    public static void main (String[] args) {
        double radius=5,height=4;
        Shapes circle = new  Shapes(radius);
        circle.area(radius);
        Shapes cylender = new Shapes(radius,height);
        cylender.area(radius,height);
    }
}
