package com.xworkz.internal;

public class UltraPowerBank extends PowerBank{
    public UltraPowerBank(){
        System.out.println("Ruuning the UltraPowerBank const");
    }
    @Override
    public void  usepowerbank(){
        System.out.println("Ruuninnng the usepowerbank method in the subclass");

    }
    public void mainusepowerbank(){
        System.out.println("Runnin the mainpowerbank method in the subclass");
    }
}
