package com.xworkz.god.internal;

public class Coin {
    public Coin(){
        System.out.println("No args const");
    }
    public void head(){
        System.out.println("Running public method in Coin");
    }
    void tail(){
        System.out.println("Running default-package method in Coin");
        numbers();
    }
    private void numbers(){
        System.out.println("Running private method in Coin");
    }

}
