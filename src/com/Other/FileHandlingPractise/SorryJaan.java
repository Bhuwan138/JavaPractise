package com.Other.FileHandlingPractise;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class SorryJaan {
    public static void main(String[] args) {
        PrintWriter fw = null;
        Scanner in = new Scanner(System.in);
        try{
            fw = new PrintWriter("d:/jaan.txt");
            System.out.println("Enter the message : ");
            String message = in.next();
            for (int i = 0; i < 1000; i++) {
                fw.print(message + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(fw != null){
                fw.close();
                System.out.println("File written sucessfully");
            }
        }
    }
}
