package com.xworkz.internal;

public class ProJuicer extends Juicer{
    public ProJuicer(){
        System.out.println("Running the ProJuicer const");
    }
    @Override
    public void usejuice(){
        System.out.println("Running the usejuice method subclass");
    }
    public void mainjuice(){
        System.out.println("Running the mainjuice method in the subclass");
    }
}
