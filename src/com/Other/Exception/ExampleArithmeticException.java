package com.Other.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleArithmeticException {
    public static void main (String[] args) {
        Scanner in  = new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter first number : ");
        try {
            a = in.nextInt();
            System.out.println("Enter Second Number : ");
            b = in.nextInt();
            int div = a/b;
            System.out.println("Division is : " + div);
        }
        catch (ArithmeticException e){
            System.out.println("Please enter non-zero number in denominator.!!!");
        }
        catch (InputMismatchException imm){
            System.out.println("Please enter Integer numbers only!!!");
            System.exit(0);
        }
        int sum = a+b;
        System.out.println("Sum is : " + sum);

    }
}



/*
* Another method

try {
            a = in.nextInt();
            System.out.println("Enter Second Number : ");
            b = in.nextInt();
            try{
                int div = a/b;
                System.out.println("Division is : " + div);
            }
            catch (java.lang.ArithmeticException e){
                System.out.println("Please enter non-zero number in denominator.!!!");
            }
            int sum = a+b;
            System.out.println("Sum is : " + sum);
        }
        catch (InputMismatchException imm){
            System.out.println("Please enter Integer numbers only!!!");
        }
 */
