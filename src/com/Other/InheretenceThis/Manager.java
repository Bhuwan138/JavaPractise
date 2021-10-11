package com.Other.InheretenceThis;

public class Manager extends Employee{
    private double bonus;

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    public double income(){
        double income = getSalary() + bonus;
        return income;
    }
}
