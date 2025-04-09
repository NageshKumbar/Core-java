package com.xworkz.external;

import com.xworkz.internal.Occupation;

public class OccupationExternal {
    public void run() {
        Occupation occupation = new Occupation();

        System.out.println(occupation.getName());
        System.out.println(occupation.getIndustry());
        System.out.println(occupation.getExperience());
        System.out.println(occupation.getSalary());
        System.out.println(occupation.getWorkLocation());
    }

}
