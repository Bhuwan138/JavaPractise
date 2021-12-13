package com.Other.Collection.ArrayList.CustomArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class UseEmp {
    public static void main (String[] args) {
        ArrayList<Emp> emp = new ArrayList<>();
        Emp e1 = new Emp(22,"Bhuwan", 95000);
        Emp e2 = new Emp(20,"Ramesh", 45800);
        Emp e3 = new Emp(24,"Harish", 65940);
        Emp e4 = new Emp(23,"Deepak", 15480);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);

        System.out.println("Before Deleting : ");
        for(Emp e : emp){
            System.out.println(e);
        }

        System.out.println("Enter the element which you want to delete (age , name , salary ) ? ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String name  = in.next();
        double salary = in.nextDouble();

        Emp f = new Emp(age,name,salary);
        System.out.println("Employee removed : " + emp.remove(f));



        System.out.println("After Deleting : ");
        for(Emp e: emp){
            System.out.println(e);
        }

        Collections.sort(emp);

        System.out.println("After Sorting : ");
        for(Emp e: emp){
            System.out.println(e);
        }






    }
}
