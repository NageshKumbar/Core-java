package com.xworkz.internal;

public class EliteDehumidifier extends Dehumidifier{
    public EliteDehumidifier(){
        System.out.println("Running the EliteDehumidifier const");

    }
    @Override
    public void usemidifier(){
        System.out.println("Running the usemidiffer method in the subclass");
    }
    public void maindiffer(){
        System.out.println("running the maindiffer nethod in the subclsss");
    }
}
