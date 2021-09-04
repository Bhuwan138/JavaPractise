package com.Bhuwan;

import java.util.Scanner;

public class LargestAmongAll {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int largest = 0;
            while (true){
                int num = sc.nextInt();
                if (num == 0){
                    break;
                }
                if (largest < num)
                largest = num;
            }
            System.out.println(largest);
        }
}
