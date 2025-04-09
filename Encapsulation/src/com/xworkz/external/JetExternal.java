package com.xworkz.external;

import com.xworkz.internal.Jet;

public class JetExternal {
    public void run() {
        Jet jet = new Jet();

        System.out.println(jet.getEngineType());
        System.out.println(jet.getFuelCapacity());
        System.out.println(jet.getJetName());
        System.out.println(jet.getJetType());
        System.out.println(jet.getLandingGear());
    }

}
