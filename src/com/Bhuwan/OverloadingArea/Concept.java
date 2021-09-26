package com.Bhuwan.OverloadingArea;

public class Concept {
//    private String name ;
//    private int age;
//    private double salary;


    void information(String name){

        System.out.println(name);
    }
    void information(String name, int age){
        System.out.println(name + "\t" + age);
    }
    void information(String name, int age, double salary){
        System.out.println(name + "\t" + age + "\t" + salary);
    }
}

class UseConcept{
    public static void main (String[] args) {
        Concept c = new Concept();
        c.information("Bhuwan");
        c.information("Bhuwan", 21);
        c.information("Bhuwan" , 21 , 1_20_000);

    }
}


/**
 * Method
 * operator
 * constructor
 * */
