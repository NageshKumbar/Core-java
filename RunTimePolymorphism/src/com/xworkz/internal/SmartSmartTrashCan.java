package com.xworkz.internal;

public class SmartSmartTrashCan extends SmartTrashCan{
    public SmartSmartTrashCan(){
        System.out.println("Running the SmartSmartTrashCan const");
    }
    @Override
    public void usesmart(){
        System.out.println("Running the overrided usesmart method in the subclass");
    }
    public void mainsmart(){
        System.out.println("Running the mainsmart method in the sub class");
    }
}
