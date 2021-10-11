package com.Other.Inheretence;
 class Animal{
     public static void eating(){
         System.out.println("Eating...");
     }
 }

 class Dog extends Animal{
     public static void barking(){
         System.out.println("Barking...");
     }
 }


public class SingleInheritance {
    public static void main (String[] args) {
        System.out.print("Dog is " );
        Dog.eating();
        System.out.print("Dog is " );
        Dog.barking();
    }
}
