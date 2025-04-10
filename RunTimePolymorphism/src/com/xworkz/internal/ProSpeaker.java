package com.xworkz.internal;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class ProSpeaker extends Speaker{
    public ProSpeaker(){
        System.out.println("Running ProSpeaker const");
    }
    @Override
    public void useseaker(){
        System.out.println("Running useseaker method form subclass");
    }
    public void mainseaker(){
        System.out.println("Running mainseaker method from subclass");
    }
}
