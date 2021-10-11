package com.Programs;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
