package com.xworkz.internal;

public class Book extends Item {
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out a book");
    }
}