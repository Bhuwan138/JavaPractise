package com.Other.Interface;

import java.util.Scanner;

public class UseShape {
    public static void main (String[] args) {
        Scanner in  = new Scanner(System.in);

        Shape s = new Rectangle(45,20);
        System.out.println("Name of Shape : " + s.nameOfShape() );
        System.out.println("Area of " + s.nameOfShape() + " is " + s.area());

        s = new Circle(7);
        System.out.println("Name of Shape : " + s.nameOfShape() );
        System.out.println("Area of " + s.nameOfShape() + " is " + s.area());

    }
}
