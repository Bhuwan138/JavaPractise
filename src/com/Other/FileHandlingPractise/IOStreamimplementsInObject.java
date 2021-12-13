package com.Other.FileHandlingPractise;

import java.io.*;
import java.util.Scanner;

class Emp1 implements Serializable {
    private int id;
    private String name;
    private double salary;
    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id, name, salary : ");
        id = sc.nextInt();
        name = sc.next();
        salary = sc.nextDouble();
    }

    public  void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }


}
public class IOStreamimplementsInObject {
    public static void main (String[] args) {

        try{

            Emp1 e1 = new Emp1();
            ObjectOutputStream dos1 = new ObjectOutputStream(new FileOutputStream("d:/ram.txt"));
            e1.get();
            dos1.writeObject(e1);
            dos1.close();
            System.out.println("File has been written sucessfully !!!");

            ObjectInputStream dis1 = new ObjectInputStream(new FileInputStream("d:/ram.txt"));
            Emp1 f = (Emp1) dis1.readObject();
            f.show();
            dis1.close();
            

        }
        catch (ClassNotFoundException cnf){
            System.out.println("Class not found");
        }
        catch (IOException io){
            System.out.println("Error in writing file");
        }
    }
}
