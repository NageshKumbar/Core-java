package com.methods.kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        FilterSystem filterSystem = new FilterSystem(kidney);
        filterSystem.filter();
    }
}
