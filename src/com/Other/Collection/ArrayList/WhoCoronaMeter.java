package com.Other.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class WhoCoronaMeter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String > country = new ArrayList<>();
        country.add("America");
        country.add("India");
        country.add("Brazil");
        country.add("Russia");
        country.add("Columbia");
        System.out.println("Enter the country name which you want to search : ");
        String s = in.next();
        if (country.contains(s) == true) {
            System.out.println(s + " country is found in " + (country.indexOf(s) +1) + "th index.");
        }
        else System.out.println("Country Not found");

    }

}

