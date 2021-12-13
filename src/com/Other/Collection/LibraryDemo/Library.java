package com.Other.Collection.LibraryDemo;

import java.util.HashSet;

public class Library {
    private HashSet<Book> hs;

    public Library(){
        hs = new HashSet<>();
    }

    public boolean addBook(Book b){
        return hs.add(b);
    }

    public int getBookCount(){
        return hs.size();
    }

    public HashSet<Book> getAllBook(){
        return hs;
    }
}
