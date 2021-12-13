package com.Other.FileHandlingPractise;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.util.Date;

public class ModifyTextFile {
    public static void main (String[] args) {
        File file = new File("D:/bhu");
//        if(file.exists()){
//            System.out.println(file.getName() + " is present");
//        }
//        else {
//            System.out.println(file.getName() + " is not present");
//            System.exit(0);
//        }

        if(file.isFile()){
            System.out.println(file.getName() + " is file");
        }
        else {
            System.out.println(file.getName() + " is not file");
        }

        if(file.isDirectory())
            System.out.println(file.getName() + " is folder");
        else
        {
            System.out.println(file.getName() + " is not folder");
        }

        if(file.isHidden())
            System.out.println(file.getName() + " is hidden");
        else {
            System.out.println(file.getName() +  " is not hidden");
        }

        System.out.println(file.getName() + " file size is " + (file.length()) + " kb" );
        System.out.println(file.getName() + " file is modified at " + file.lastModified());
        Date d = new Date(file.lastModified());
        System.out.println(" Date modified time is " + d);
//        System.out.println("Is folder is available ? " + file.mkdirs());
        System.out.println("Deleted File is ? " + file.delete());
    }
}
