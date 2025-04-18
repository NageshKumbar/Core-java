package com.xworkz.internal;

public class Novel extends Book {
    public Novel(String title, String author) {
        super(title, author);
    }
    @Override public String toString() {
        return "Novel [title=" + title + ", author=" + author + "]";
    }
}
