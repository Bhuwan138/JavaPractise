package com.Bhuwan.ArraySum;

import java.util.Scanner;

public class UseArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculate c= new Calculate();
        int n = in.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Array is : ");
        for (int x : arr) {
            System.out.println(x + " ");
        }
        double []result;
        result = c.arraySum(arr);
        System.out.println("Sum of Array Element is : " + result[0]);
        System.out.println("Average of Array Element is : " + result[1]);
    }
}
