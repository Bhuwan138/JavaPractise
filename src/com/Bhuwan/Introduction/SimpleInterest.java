//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
package com.Bhuwan;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Principle : ");
        int principle = s.nextInt();

        System.out.println("Enter  (Years) : ");
        int time = s.nextInt();

        System.out.println("Enter Rate : ");
        float rate = s.nextFloat();

//        Calculating Simple Interest
        float si = (principle * time * rate) / 100;

        System.out.println("Your Simple Interest is : " + si);

    }
}
