//Write a program to print factorial of a number, also take input.
package com.Bhuwan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1,num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = s.nextInt();
        for (int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
