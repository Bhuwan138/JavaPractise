package com.Other.FileHandlingPractise;


import java.io.*;

public class FileReadingDemo {
    public static void main (String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("D:/bhuwan.txt");
            BufferedReader br = new BufferedReader(fr);
//            int count;
//            File f = new File("D:/bhuwan.txt");
//            char []ch = new  char[(int)f.length()];

//            count = fr.read(ch);
//            String str = new String(ch);
//            System.out.println(str);
//            int ch;
            String str = null;
            int count = 0;
            while ((str = br.readLine()) != null){
                System.out.print(str);
                count += str.length();
            }
            System.out.println("\nTotal character read : " + count);
        }
        catch (FileNotFoundException fnf){
            System.out.println("File not found! ");
        }
        catch (IOException io){
            System.out.println("Error while reading file ");
        }

        finally {
            if (fr != null) {
                try {
                fr.close();
                }
                catch (IOException io){
                    System.out.println("Error while closing file");
                }
            }
        }

    }

}
