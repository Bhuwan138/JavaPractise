package com.Other.Collection.LibraryDemo;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private double prize;

    public Book (String bookName, String authorName, double prize) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.prize = prize;
    }

    @Override
    public String toString () {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", prize=" + prize +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.prize, prize) == 0 && bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode () {
        return Objects.hash(bookName, authorName, prize);
    }
}
