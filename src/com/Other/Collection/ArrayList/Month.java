package com.Other.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Month {
    public static void main (String[] args) {
        ArrayList<String> month = new ArrayList<>(12);
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        System.out.println(month.contains("March"));
        System.out.println(month.contains("June"));
        System.out.println(month.contains("march"));
        System.out.println(month.indexOf("March"));
        System.out.println(month.indexOf("June"));
        System.out.println(month.indexOf("march"));
    }

}
