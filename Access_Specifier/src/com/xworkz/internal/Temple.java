package com.xworkz.god.internal;

public class Temple {
    String darshan;
    public void prasad(){
        System.out.println("Prasadh is running in temple");
    }
    public Temple(String darshan){
        this.darshan=darshan;
        System.out.println(darshan);
    }
    public Temple(){
        System.out.println("hello");
    }
}
