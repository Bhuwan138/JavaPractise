package com.Other.Inheretence.AreaVol;

public class UseCylender {
    public static void main (String[] args) {
        Cylender c = new Cylender(5,7);
        System.out.println("Area of Cylender is :" + c.area());
        System.out.println("Volume of Cylender is : " + c.volume());
    }
}
