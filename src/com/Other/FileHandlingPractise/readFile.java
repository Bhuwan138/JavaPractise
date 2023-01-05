package com.Other.FileHandlingPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader("d:/ram.txt");
            File f = new File("d:/ram.txt");
            char[] ch = new char[(int)f.length()];
            fr.read(ch);
            String s= new String(ch);
            System.out.print(s);
            System.out.println("\nTotal no of character is :" + s.length() );

        } catch (FileNotFoundException e) {
            System.out.println("Error in Reading File");
        } catch (IOException ioException){
            System.out.println("Error in file " + ioException.toString());
        }
        finally {
            try {
                if (fr != null) fr.close();
            }catch (IOException i){
                System.out.println("Error in Closing File");
            }

        }
    }
}
