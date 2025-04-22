package com.xworkz.external;

import com.xworkz.internal.rules.Printer;

public class LaserPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("running printer inside laser printer");
    }
}
