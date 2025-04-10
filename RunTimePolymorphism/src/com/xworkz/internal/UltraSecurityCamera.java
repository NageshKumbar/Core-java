package com.xworkz.internal;

public class UltraSecurityCamera extends  SecurityCamera{
    public UltraSecurityCamera(){
        System.out.println("Running the UltraSecurityCamera const");
    }
    @Override
    public void usesecuritycamere(){
        System.out.println("Running the usesecuritycamere method in the subclass");

    }
    public void mainsecuritycamera(){
        System.out.println("Running the mainsecuritycamera method in the subclas");
    }
}
