package com.xworkz.internal;

public class UltraBlender extends Blender{
    public UltraBlender(){
        System.out.println("Running the UltraBlender const");
    }
    @Override
    public void useblender(){
        System.out.println("Running the useblender method in the subclass");
    }
    public void mainbleder(){
        System.out.println("Runnig the mainblender method in the subclass");
    }
}
