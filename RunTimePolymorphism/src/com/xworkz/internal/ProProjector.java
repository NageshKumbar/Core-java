package com.xworkz.internal;

public class ProProjector extends Projector{
    public ProProjector(){
        System.out.println("Running ProProjector const in subclass");
    }
    @Override
    public void useprojector(){
        System.out.println("Running  overrided useprojector method in the subclass");
    }
    public void mainprojector(){
        System.out.println("Running mainproject method in the subclass");
    }
}
