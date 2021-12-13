package com.ExamPractise;
interface Fruits{
    String name();
}
class Mango implements Fruits{
    public String name(){return "Name : Mango";}
}
class Orange implements Fruits{
    public String name(){return "Name : Orange";}
}

public class UseOverRide {
    public static void main (String[] args) {
        Fruits mango = new Mango();
        System.out.println(mango.name());
        Fruits orange = new Orange();
        System.out.println(orange.name());
    }
}
