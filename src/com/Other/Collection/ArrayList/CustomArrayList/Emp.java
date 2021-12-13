package com.Other.Collection.ArrayList.CustomArrayList;

import java.util.Objects;

public class Emp implements Comparable {
    private int age;
    private String name;
    private double salary;


    public Emp (int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

    public double getSalary () {
        return salary;
    }

    @Override
    public String toString () {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return getAge() == emp.getAge() && Double.compare(emp.getSalary(), getSalary()) == 0 && Objects.equals(getName(), emp.getName());
    }

    @Override
    public int hashCode () {
        return 0;
    }

    @Override
    public int compareTo (Object o) {
        Emp e = (Emp) o;
        if (this.age > e.age)
            return 1;
        else if (this.age < e.age)
            return -1;
        else
            return 0;


    }
}
