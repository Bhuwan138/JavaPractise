package com.Other.Collection.LibraryDemo;

import java.util.HashSet;
import java.util.Iterator;

public class UseLibrary {
    public static void main (String[] args) {
        Book b1 = new Book("Java", "Bhuwan", 785);
        Book b2= new Book("C Program", "Ramesh", 965);
        Book b3= new Book("C++ Program", "Ramesh", 980);
        Book b6= new Book("Python", "Ram", 988);
        Book b4 = new Book("Java", "Bhuwan", 785);
        Book b5= new Book("C Program", "Ramesh", 965);

        Library library = new Library();
        System.out.println("Book Added : " +  library.addBook(b1) );
        System.out.println("Book Added : " +  library.addBook(b2) );
        System.out.println("Book Added : " +  library.addBook(b3) );
        System.out.println("Book Added : " +  library.addBook(b4) );
        System.out.println("Book Added : " +  library.addBook(b5) );
        System.out.println("Book Added : " +  library.addBook(b6) );

        System.out.println("Total Numbers of book : " + library.getBookCount());


        HashSet<Book> hs = library.getAllBook();
        Iterator<Book> i = hs.iterator();
        while (i.hasNext()){
            Book b =  i.next();
            System.out.println(b);
        }

    }
}
