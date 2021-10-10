package com.Programs;

import java.util.Scanner;

public class LargestAmongTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest;
        largest = Math.max(a,b);
        System.out.println(largest);
    }
}