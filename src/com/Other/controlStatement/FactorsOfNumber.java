package com.Programs.controlStatement;

import java.util.Scanner;

public class FactorsOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(i<=num){
            if (num%i==0){
                System.out.print(i + "\t");
            }
            i++;
        }
    }
}
