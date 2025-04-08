package com.xworkz.god.internal;

public class Shell {

    public Shell() {
        System.out.println("no-parameter const of Shell");
    }

    public void getMaterial() {
        System.out.println("running getMaterial in Shell");
    }

    void getColor() {
        System.out.println("running getColor in Shell");
        getThickness();
    }

    private void getThickness() {
        System.out.println("running getThickness in Shell");
    }
}
