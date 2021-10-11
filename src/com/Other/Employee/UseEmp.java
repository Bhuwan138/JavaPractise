package com.Other.Employee;

public class UseEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp("Rohit", 21);
        emp1.show();
        emp1.showNextID();
        Emp emp2 = new Emp("Ram", 18);
        emp2.show();
        emp2.showNextID();
        Emp emp3 = new Emp("Harish", 20);
        emp3.show();
        emp3.showNextID();
        System.out.println("Internship Starts");
        {
            Emp emp4 = new Emp("Ramesh" , 25);
            emp4.show();
            emp4.showNextID();
            Emp emp5 = new Emp("Ramesh", 25);
            emp5.show();
            emp5.showNextID();
            System.out.println("Internship Ends Here");
            emp4 = emp5 = null;
            System.gc();
            System.runFinalization();
        }
        emp1.showNextID();

    }
}
