package com.xworkz.god.external;

import com.xworkz.god.internal.Shell;

public class Snail {

    Shell shell = new Shell();

    public Snail() {
        System.out.println("no-parameter const of Snail");
        shell.getMaterial();
    }
}