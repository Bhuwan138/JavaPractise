package com.Bhuwan;

import java.util.Scanner;

public class CurrencyConveter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currencyInNPR = sc.nextDouble();
        double currencyInUSD;
        currencyInUSD = currencyInNPR / 118.00;
        System.out.println("$" + currencyInUSD);
    }
}
