package com.methods.cigarrete;

public class CigarreteRunner {
    public static void main(String[] args) {
        Cigarrete cigarrete = new Cigarrete();
        Smoke smoke = new Smoke(cigarrete);
        smoke.smoking();
    }
}
