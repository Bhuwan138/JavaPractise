package com.Other.StringHandling;

public class UseBox {
    public static void main (String[] args) {
//        Box b1 = new Box(10,20,30);
//        Box b2 = new Box(10,20,30);
//        b1.show();
//        b2.show();
//        System.out.println(b1.equals(b2));
//            String s= "bhuwan";
//        System.out.println(s.hashCode());

        StringBuffer s = new StringBuffer("Bhuwan");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.ensureCapacity(25);
        System.out.println(s.capacity());

    }
}
