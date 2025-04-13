package com.xworkz.internal;

public class Notebook extends Items {
    public void turnPage() {
        System.out.println("Turning notebook page");
    }

    @Override
    public void use() {
        System.out.println("Writing in notebook");
    }
}
