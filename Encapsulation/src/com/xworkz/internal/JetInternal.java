package com.xworkz.internal;

public class JetInternal {
    public void runInternal() {
        Jet jet = new Jet();

        System.out.println("----------Updated values----------");
        jet.setEngineType("Turbojet");
        jet.setFuelCapacity("8000 Liters");
        jet.setJetName("B-2");
        jet.setJetType("Stelth Bomber");
        jet.setLandingGear("Tricycle Type");

        System.out.println(jet.getEngineType());
        System.out.println(jet.getFuelCapacity());
        System.out.println(jet.getJetName());
        System.out.println(jet.getJetType());
        System.out.println(jet.getLandingGear());
    }
}
