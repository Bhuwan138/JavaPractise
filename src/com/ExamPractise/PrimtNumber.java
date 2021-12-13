package com.ExamPractise;

import java.util.Scanner;

public class PrimtNumber {
    public static void main (String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number =  in.nextInt();


        for (int k = 1; k <= number; k++) {
            boolean check= true;

            if(k <=1)
                continue;
            for (int i = 2; i < k; i++) {
                if(k % i == 0){
                    check = false;
                    break;
                }
            }

            if(check == true){
                System.out.print(k + " \t");
            }
        }








    }
}
