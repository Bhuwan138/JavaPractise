package com.ExamPractise;

public class UseString {
    public static void main (String[] args) {
        String a,b;
        a = "Bhuwan";
        b = "Pandey";

        System.out.println("Length of a is " + a.length());
        System.out.println("value of B in capital letter is  " + b.toUpperCase());
        System.out.println("The first letter of A is :  " + a.charAt(0));
        System.out.println("Concatination of a and b makes : " + a.concat(b));
        System.out.println(a.contains("u"));

        System.out.println(a.indexOf('n'));


    }
}
