package com.xworkz.internal;

public class MaxPrinter extends Printer{
    public MaxPrinter(){
        System.out.println("Runniig maxPrinter const ");
    }
    @Override
    public void useprinter(){
        System.out.println("Runinng useprinter method from subclass ");
    }
    public void mainprinter(){
        System.out.println("Running mainprinter methhod in subclass ");
    }
}
