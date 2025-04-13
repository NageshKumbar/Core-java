package com.xworkz.runner;

import com.xworkz.internal.Generator;
import com.xworkz.internal.Inverter;

public class Runner {
    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.generate();

        Generator generator1 = new Inverter();
        generator1.generate();

        //SubClass ref = (SubClass)ParentClassRef;
        Inverter generator2 = (Inverter)generator1;
        generator2.backup();

        Inverter inverter = new Inverter();
        inverter.generate();
        inverter.backup();

    }
}
