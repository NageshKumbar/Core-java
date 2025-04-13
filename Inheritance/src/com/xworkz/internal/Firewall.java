package com.xworkz.internal;

public class Firewall extends Systems {
    public void configureRules() {
        System.out.println("Configuring firewall rules");
    }

    @Override
    public void protect() {
        System.out.println("Firewall blocking threats");
    }
}