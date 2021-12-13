package com.ExamPractise;

import java.util.Scanner;

public class UseExceptionHandling {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c=a/b;
            System.out.println("Division is : " + c);
        }catch (ArithmeticException e){
            System.out.println("Cannot be divisible by zero; Error : " + e);
        }
    }
}
