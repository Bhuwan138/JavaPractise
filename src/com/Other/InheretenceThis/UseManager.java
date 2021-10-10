package com.Other.InheretenceThis;

public class UseManager {
    public static void main (String[] args) {
        Manager harish  = new Manager();
        String name  = "Bhuwan";
        double salary = 45000;
        double bonus = 5000;
        harish.setDetail(name,salary);
        harish.setBonus(bonus);
        double income = harish.income();
        System.out.println(" Name : " + harish.getName() + " \n Salary : " + salary + " \n Bonus : " + bonus + " \n Total Income : " + income);

    }
}
