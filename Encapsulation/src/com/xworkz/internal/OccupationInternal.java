package com.xworkz.internal;

public class OccupationInternal {
    public void runInternalOccupation() {
        Occupation occupation = new Occupation();

        System.out.println("---------- After Updated ----------");
        occupation.setName("Software Engineer");
        occupation.setIndustry("IT");
        occupation.setExperience("3 years");
        occupation.setSalary("8 LPA");
        occupation.setWorkLocation("Bangalore");

        System.out.println(occupation.getName());
        System.out.println(occupation.getIndustry());
        System.out.println(occupation.getExperience());
        System.out.println(occupation.getSalary());
        System.out.println(occupation.getWorkLocation());
    }
}
