package com.xworkz.external;

import com.xworkz.internal.rules.Engine;

public class CarEngine implements Engine {

    @Override
    public void start() {
        System.out.println("running start in Car Engine");
    }
}
