package com.xworkz.god.external;

import com.xworkz.god.internal.Forest;

public class River {

    Forest forest = new Forest();

    public River() {
        System.out.println("no-parameter const of river");
        forest.addTree();
    }
}
