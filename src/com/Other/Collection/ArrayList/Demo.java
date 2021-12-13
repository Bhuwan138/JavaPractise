package com.Other.Collection.ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main (String[] args) {
        ArrayList<String > obj = new ArrayList<>();
        obj.add("Bhuwan");
        obj.add("Ramesh");
        obj.add("Harish");
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.size());
    }
}
