package com.xworkz.god.internal;

public class Beach {
    public Beach(){
        System.out.println("No args const");
    }
    public void water(){
        System.out.println("Running public method in beach");
    }
    void Fish(){
        System.out.println("Running package-default method in beach");
        snacks();
    }
    private void snacks(){
        System.out.println("Running private method in beach");
    }
}
