package com.Other.Interface;

import java.util.Scanner;

public class UseConver {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the weight of person (in KG) : ");
        int weight = in.nextInt();
        System.out.println("Enter the Height of person (in INCH) : ");
        int height = in.nextInt();

        MyConstrant c= new Convert();
        System.out.println("Weight in G :"  + c.KgToG(weight) );
        System.out.println("Height in MM : " + c.InchToMm(height) );


    }
}
