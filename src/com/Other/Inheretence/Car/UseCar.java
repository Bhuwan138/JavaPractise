package com.Other.Inheretence.Car;

import com.sun.rowset.CachedRowSetImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCar {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            n = scanner.nextInt();
            int sqr = (int) Math.pow(n, 2);
            System.out.println("Square of " + n + " is " + sqr);
        }catch(InputMismatchException inputMismatchException) {
            System.out.println("Enter number only "+ inputMismatchException);
        }
    }

}
