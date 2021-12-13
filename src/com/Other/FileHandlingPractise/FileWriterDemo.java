package com.Other.FileHandlingPractise;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main (String[] args) {
//        FileWriter fw = null;
        PrintWriter fw = null;
        Scanner in = new Scanner(System.in);
        try{
//            fw = new FileWriter("d:/ram.txt", true);
            fw = new PrintWriter("d:/ram.txt");
            System.out.println("Enter the name -> ");
            String name = in.next();
            System.out.println("Enter the phone number : ");
            long phone = in.nextLong();
            fw.print(name + " ");
//            fw.write("\r\n");
            fw.println(phone);
        }
        catch (FileNotFoundException fnf){
            System.err.println("File not found !!");
        } finally {
            if (fw != null) {
                fw.close();
                System.out.println("File written sucessfully");
            }
        }
    }
}
