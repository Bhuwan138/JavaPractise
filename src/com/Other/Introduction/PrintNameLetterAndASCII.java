package com.Programs.Introduction;

import java.util.Scanner;

class PrintNameLetterAndASCII{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println("The UNICODE of " + ch + " is  " + (int)(ch));
    }
}