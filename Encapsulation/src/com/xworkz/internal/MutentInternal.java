package com.xworkz.internal;

public class MutentInternal {
    public void runInternal() {
        Mutent mutent = new Mutent();

        System.out.println("----------after updated---------");
        mutent.setName("Deadpool");
        mutent.setPower("Regenerate");
        mutent.setType("Useless");
        mutent.setIsHero("yes");
        mutent.setWeapon("Swords");

        System.out.println(mutent.getName());
        System.out.println(mutent.getPower());
        System.out.println(mutent.getType());
        System.out.println(mutent.getIsHero());
        System.out.println(mutent.getWeapon());
    }
}
