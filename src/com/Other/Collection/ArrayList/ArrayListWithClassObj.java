package com.Other.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithClassObj {
    public static void main(String[] args) {

        Employees employees = new Employees(1,"Bhuwan",20000);
        Employees employees1 = new Employees(2,"Sarita",40000);


        //Employees employees1 = new Employees(2,"Sarita",40000);

        List<Employees> employeeList = new ArrayList<>();
        employeeList.add(employees);
        employeeList.add(employees1);

        for(Employees emp : employeeList){
            System.out.println("ID : " + emp.getId() + "\tName : " + emp.getName() + "\tSalary : " + emp.getSalary());;
        }

    }
}


class Employees{
    private int id;
    private String name;
    private double salary;

    public Employees() {
    }

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
