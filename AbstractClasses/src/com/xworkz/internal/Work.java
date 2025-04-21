package com.xworkz.internal;

public class Work extends Job {
    @Override
    public void carpenter() {
        System.out.println("printing carpenter in work");
    }

    @Override
    public void doctor() {
        System.out.println("printing doctor in work");
    }

    @Override
    public void engineer() {
        System.out.println("printing engineer in work");
    }

    @Override
    public void plumber() {
        System.out.println("printing plumber in work");
    }

    @Override
    public void teacher() {
        System.out.println("printing teacher in work");
    }
}
