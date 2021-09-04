//Write a program to print whether a number is even or odd, also take input.
package com.Bhuwan;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        if (num%2==0){
            System.out.println("Even Number ");
        }
        else {
            System.out.println("Odd Number ");
        }
    }
}
