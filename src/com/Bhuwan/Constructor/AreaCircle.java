package com.Bhuwan.Constructor;

import java.util.Scanner;

class AreaCircle{
    private int radius;
    private int height;

    AreaCircle(int r){
        this.radius = r;
    }

    AreaCircle(int radius , int height){
        this.radius = radius;
        this.height = height;
    }

    public void show(){
        System.out.println("Area is circle is : " + (Math.PI * Math.pow(radius,2)));
    }

    public void display(){
        System.out.println("Area of Cylender is : " + ((2* Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2))) );
    }
}

class UseAreaCircle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius,height;
        System.out.println("Enter the value of Radius : ");
        radius = in.nextInt();
        System.out.println("Enter the value of Height : ");
        height = in.nextInt();
        AreaCircle a = new AreaCircle(radius);
        a.show();
        AreaCircle b = new AreaCircle(radius,height);
        a.display();

    }
}
