package com.Other.FileHandlingPractise;

import java.io.*;
import java.util.Map;

public class IOStreamDemo {
    public static void main (String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{
            FileOutputStream fos = new FileOutputStream("d:/ram.txt");
            dos = new DataOutputStream(fos);
            dos.writeDouble(Math.PI);
            dos.close();

            FileInputStream fis = new FileInputStream("d:/ram.txt");
            dis = new DataInputStream(fis);
            System.out.println("Value of PI is : " + dis.readDouble());
            dis.close();


        }
        catch (FileNotFoundException fnf){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
