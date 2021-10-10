package com.Other.Employee;

public class Emp {
private int id;
    private static int nextID = 1;
    private  String name;
    private  int age;
    public Emp(String name , int age){
        this.name = name;
        this.age = age;
        id = nextID++;
    }
    public void show(){
        System.out.println(id + ") \t" + name + " \t" + age);
    }
    void showNextID(){
        System.out.println("Next ID of Employ is : " + nextID);
    }
    protected void finalize(){
        --nextID;
    }
}
