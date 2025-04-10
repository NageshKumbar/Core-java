package com.xworkz.internal;

public class ProIntercom extends Intercom{
    public ProIntercom(){
        System.out.println("Running the ProIntercom const");
    }
    @Override
    public void useinter(){
        System.out.println("Running the useinter method in the subclass");
    }
    public void maininter(){
        System.out.println("Running the maininter method in the subclass");
    }
}
