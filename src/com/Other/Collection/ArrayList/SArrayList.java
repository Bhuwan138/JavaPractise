package com.Other.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class SArrayList {
    public static void main (String[] args) {
        ArrayList<Integer> a  = new ArrayList<>();

        a.add(1);
        a.add(78);
        a.add(95);
        a.add(91);
        a.add(65);

        System.out.println(a);

        a.remove(3);
        System.out.println(a);

        a.add(2,74);
//        [1,78,74,95,91,65]
        System.out.println(a);





    }
}
