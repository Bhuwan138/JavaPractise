package com.Other.String;

public class StringMethod {
    public static void main (String[] args) {
        String fName = "Ram ";
        String lName = "Bhattrai";
        System.out.println(" --> First Name  + Last Name : " + fName.concat(lName));
        System.out.println(" --> Is first Name and Last name are equal ? " + fName.equals(lName));
        System.out.println(" --> Length of String is " + fName.length());
        System.out.println(" --> First name in Upper case : " + fName.toUpperCase());
    }
}
