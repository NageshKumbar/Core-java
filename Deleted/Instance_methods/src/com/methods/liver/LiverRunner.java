package com.methods.liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        Pancreas pancreas = new Pancreas(liver);
        pancreas.secretion();
    }
}
