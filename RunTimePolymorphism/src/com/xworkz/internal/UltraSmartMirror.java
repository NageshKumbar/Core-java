package com.xworkz.internal;

public class UltraSmartMirror extends SmartMirror{
    public UltraSmartMirror(){
        System.out.println("Running the UltraSmartMirror const");
    }
    @Override
    public void usemirror(){
        System.out.println("Runnning the usemirror method in the subclass");
    }
    public void mainmirror(){
        System.out.println("running the mainmirror method in the subclass");
    }
}
