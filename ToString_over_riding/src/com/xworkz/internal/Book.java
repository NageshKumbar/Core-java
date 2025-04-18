package com.xworkz.internal;

public class Book {
    final String title;
    final String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
