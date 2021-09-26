package com.Bhuwan.Employee;

public class UseEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp("Bhuwan", 21);
        emp1.show();
        emp1.showNextID();
        Emp emp2 = new Emp("Ram", 18);
        emp2.show();
        emp2.showNextID();
        Emp emp3 = new Emp("Harish", 20);
        emp3.show();
        emp3.showNextID();


    }
}
