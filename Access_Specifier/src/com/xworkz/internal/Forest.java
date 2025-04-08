package com.xworkz.god.internal;

public class Forest {

    public Forest() {
        System.out.println("no-parameter const of forest");
    }

    public void addTree() {
        System.out.println("running addTree in forest");
    }

    void countTree() {
        System.out.println("running countTree in forest");
        treeType();
    }

    private void treeType() {
        System.out.println("running treeType in forest");
    }
}
