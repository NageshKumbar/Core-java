package com.xworkz.external;

import com.xworkz.internal.Mutent;

public class MutentExternal {
    public void run() {
        Mutent mutent = new Mutent();

        System.out.println(mutent.getName());
        System.out.println(mutent.getType());
        System.out.println(mutent.getPower());
        System.out.println(mutent.getIsHero());
        System.out.println(mutent.getWeapon());
    }
}
