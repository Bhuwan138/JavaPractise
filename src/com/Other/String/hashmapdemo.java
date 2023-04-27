package com.Other.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<String,Double> employee = new HashMap<>();
        employee.put("Ram",45000.5);
        employee.put("Shyam",50000D);
        employee.put("Hari",35200.00);
        employee.put("Sita",69000D);

        for(Map.Entry<String,Double> e : employee.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

//        using lambda expression
//        employee.forEach((key,value) ->{
//            System.out.println(key + " -> " + value);
//        });
    }
}
