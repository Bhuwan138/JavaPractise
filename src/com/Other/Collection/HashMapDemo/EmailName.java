package com.Other.Collection.HashMapDemo;

import java.util.HashMap;


public class EmailName {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("pandeybhuwan138@gmail.com","Bhuwan Pandey");
        map.put("bsarita926@gmail.com","Sarita Bist");
        System.out.println(map.keySet().toArray()[0]);
    }
}
