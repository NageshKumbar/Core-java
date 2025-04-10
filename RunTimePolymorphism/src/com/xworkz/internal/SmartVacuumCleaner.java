package com.xworkz.internal;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class SmartVacuumCleaner extends VacuumCleaner{
    public SmartVacuumCleaner(){
        System.out.println("Running smartVacuumCleaner const");
    }
    @Override
    public void usevaccum(){
        System.out.println("Runnning usevaccumn method in the subclass");
    }
    public void mainvaccumn(){
        System.out.println("Running mainvaccumn method in the subclass");
    }
}
