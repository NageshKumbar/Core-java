package com.xworkz.internal;

public class ProGraphicsTablet extends GraphicsTablet{
    public ProGraphicsTablet(){
        System.out.println("Running the ProGraphicsTablet const");
    }
    @Override
    public void usetablet(){
        System.out.println("Running the usetablet method in the subclass");
    }
    public void maintablet(){
        System.out.println("Ruunning the maintable method in the subclass");
    }
}
