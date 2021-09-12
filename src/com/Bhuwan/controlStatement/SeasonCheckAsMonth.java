package com.Bhuwan.controlStatement;

import java.util.Scanner;

public class SeasonCheckAsMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        switch(month){
            case 1,2,11,12 -> System.out.println("Wihter");
            case 3,4,5,6 -> System.out.println("Summer");
            case 7,8,9,10 -> System.out.println("Rainy");
            default -> System.out.println("Wrong Input");
        }
    }
}
