package com.xworkz.internal;

public class MaxBarcodeScanner extends BarcodeScanner{
    public MaxBarcodeScanner(){
        System.out.println("Running the MaxBarcodeScanner const");
    }
    @Override
    public void usebar(){
        System.out.println("Running the usebar method in the subclass");
    }
    public void mainbar(){
        System.out.println("Running the mainbar method in the mainbar");
    }
}
