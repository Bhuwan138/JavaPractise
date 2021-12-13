package com.Other.Collection.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Country{
    private String name;
    public Country(String name){
        this.name = name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return name.equals(country.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name);
    }

    @Override
    public String toString () {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class HashSetDemo {
    public static void main (String[] args) {
        HashSet<String> hs = new HashSet<>();
        Country c0 = new Country("Nepal");
        Country c1 = new Country("Nepal");
        System.out.println(c0 == c1);
        System.out.println("Hashcode of c0 :" + c0.hashCode());
        System.out.println("Hashcode of c1 :" + c1.hashCode());


        hs.add("Nepal");
        hs.add("India");
        hs.add("Pakistan");
        hs.add("China");
        hs.add("America");

        Iterator<String> e = hs.iterator();
        while (e.hasNext()){
            String str = e.next();
            System.out.println(str);
        }


    }
}
