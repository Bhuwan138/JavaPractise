package com.Other.FileHandlingPractise;

import java.io.*;
import java.util.Scanner;

class Emp{
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

    public void writeInFile(){
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/ram.txt"));
            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeDouble(salary);
            dos.close();
            System.out.println("Object write in file sucessfully !!!");
        }
        catch (FileNotFoundException fnf){
            System.out.println("File not found");
        }
        catch (IOException io){
            System.out.println("Error in writing file");
        }


    }

    public void readFromFile(){
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("d:/ram.txt"));
            dis.readInt();
            dis.readUTF();
            dis.readDouble();
            dis.close();
            System.out.println("File readed sucessfully !!!");
        }
        catch (FileNotFoundException fnf){
            System.out.println("File Not found ");
        }
        catch (IOException io){
            System.out.println("Error in reading file ");
        }
    }
}

public class IOStreamObjectMaking {
    public static void main (String[] args) {
        Emp e = new Emp();
        e.get();
        e.writeInFile();

        e.readFromFile();
        e.show();
    }
}
