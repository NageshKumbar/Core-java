package com.methods.earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth=new Earth();
        GlobalWarming globalWarming=new GlobalWarming(earth);
        globalWarming.leaf();
    }
}