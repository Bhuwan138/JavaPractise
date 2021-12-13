package com.Other.Collection.HashSetDemo;

import java.util.*;

public class NamePhone {
    public static void main (String[] args) {
        HashMap<String,Long> BTeam =  new HashMap<>();
        BTeam.put("Bhuwan", 9863890810L);
        BTeam.put("Sarita", 9845632106L);
        BTeam.put("Tek", 9846782940L);
        BTeam.put("Ajay", 9865757596L);

        //For value only
        Collection value = BTeam.values();
        Iterator<Long> it = value.iterator();
        while (it.hasNext()){
            Long l = it.next();
            System.out.println("Phone no : " + l);
        }

        //For key only
//        Set<String> name = BTeam.keySet();
//        Iterator<String > it = name.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println("Name : " + str);
//        }

        //For Entire Tree Map
//        Set<Map.Entry<String,Long>> entire =  BTeam.entrySet();
//        Iterator<Map.Entry<String,Long>> it = entire.iterator();
//        while (it.hasNext()){
//            Map.Entry<String ,Long> m = it.next();
//            System.out.println("Name : " + m.getKey() + ",\t Phone : " + m.getValue());
//        }

    }
}
